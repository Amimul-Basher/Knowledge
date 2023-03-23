package designpattern.notification.factories;


import designpattern.notification.classes.MailNotification;
import designpattern.notification.classes.NotificationService;

public class MailNotificationFactory implements AbstractFactory {

    @Override
    public NotificationService getNotificationService() {
        return new MailNotification();
    }
}
