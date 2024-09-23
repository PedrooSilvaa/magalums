package tech.silva.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.silva.magalums.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
