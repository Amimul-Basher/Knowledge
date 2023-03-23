package designpattern.notification.classes;

public class MobileNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Mobile Notification sent");
    }
}
