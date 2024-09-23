package tech.silva.magalums.service;

import org.springframework.stereotype.Service;
import tech.silva.magalums.dto.ScheduleNotificationDto;
import tech.silva.magalums.entity.Notification;
import tech.silva.magalums.repository.NotificationRepository;

import java.util.Optional;

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
}
