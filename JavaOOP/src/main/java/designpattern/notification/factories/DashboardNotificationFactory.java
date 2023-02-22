package designpattern.notification.factories;

import designpattern.notification.classes.DashboardNotification;
import designpattern.notification.classes.NotificationService;

public class DashboardNotificationFactory implements AbstractFactory{
    @Override
    public NotificationService getNotificationService() {
        return new DashboardNotification();
    }
}
