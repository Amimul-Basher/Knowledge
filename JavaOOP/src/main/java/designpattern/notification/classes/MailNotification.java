package designpattern.notification.classes;

public class MailNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Main notification sent");
    }
}
