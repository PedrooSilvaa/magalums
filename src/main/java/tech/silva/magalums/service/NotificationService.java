package tech.silva.magalums.service;

import org.springframework.stereotype.Service;
import tech.silva.magalums.dto.ScheduleNotificationDto;
import tech.silva.magalums.entity.Notification;
import tech.silva.magalums.entity.Status;
import tech.silva.magalums.repository.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notificationId){
        var notification = findById(notificationId);
        if (notification.isPresent()){
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }

    public void checkAndSame(LocalDateTime dateTime){
        var notifications = notificationRepository.findByStatusInAndDateTimeBefore(List.of(
                Status.Values.PENDING.toStatus(),
                Status.Values.ERROR.toStatus()),
                dateTime);

        notifications.forEach(getNotificationConsumer());
    }

    private Consumer<Notification> getNotificationConsumer() {
        return notification -> {
            //TODO  - Realizar envio da notificacao
            notification.setStatus(Status.Values.SUCCESS.toStatus());
            notificationRepository.save(notification);
        };
    }
}
