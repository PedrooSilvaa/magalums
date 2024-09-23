package tech.silva.magalums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.silva.magalums.dto.ScheduleNotificationDto;
import tech.silva.magalums.entity.Notification;
import tech.silva.magalums.repository.NotificationRepository;
import tech.silva.magalums.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<?> scheduleNotification(@RequestBody ScheduleNotificationDto dto){
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable("notificationId") Long notificationId){
        var notification = notificationService.findById(notificationId);

        if (notification.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(notification.get());
    }
}
