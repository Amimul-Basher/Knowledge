package designpattern.notification.factories;

import designpattern.notification.classes.NotificationService;

public interface AbstractFactory {
    public NotificationService getNotificationService();
}
