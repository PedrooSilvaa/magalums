package tech.silva.magalums.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.silva.magalums.dto.ScheduleNotificationDto;
import tech.silva.magalums.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<?> scheduleNotification(@RequestBody ScheduleNotificationDto dto){
        notificationService.scheduleNotification(dto);
        return ResponseEntity.accepted().build();
    }

}
