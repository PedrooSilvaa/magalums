package tech.silva.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.silva.magalums.entity.Notification;
import tech.silva.magalums.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}
