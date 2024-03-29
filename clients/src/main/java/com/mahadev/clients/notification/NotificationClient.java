package com.mahadev.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value="notification")
public interface NotificationClient {

    @PostMapping(path="api/v1/notification")
    void sendNotification(NotificationRequest notificationRequest);
}
