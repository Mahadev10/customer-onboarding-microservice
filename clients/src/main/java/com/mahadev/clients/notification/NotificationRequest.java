package com.mahadev.clients.notification;
import java.time.LocalDateTime;

public record NotificationRequest(Integer toCustomerId,
                                  String toCustomerEmail,
                                  String message
) {
}
