package tech.silva.magalums.dto;

import tech.silva.magalums.entity.Channel;
import tech.silva.magalums.entity.Notification;
import tech.silva.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDto(LocalDateTime dateTime,
                                      String destination,
                                      String message,
                                      Channel.Values channel){

    public Notification toNotification(){
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.Values.PENDING.toStatus()
        );
    }

}
