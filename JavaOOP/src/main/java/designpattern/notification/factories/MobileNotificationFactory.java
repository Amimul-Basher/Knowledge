package designpattern.notification.factories;


import designpattern.notification.classes.MobileNotification;
import designpattern.notification.classes.NotificationService;

public class MobileNotificationFactory implements AbstractFactory {

    @Override
    public NotificationService getNotificationService() {
        return new MobileNotification();
    }
}
