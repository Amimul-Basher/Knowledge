package designpattern.notification.classes;

public class DashboardNotification implements NotificationService{
    @Override
    public void sendNotification() {
        System.out.println("Dashboard Notification sent");
    }
}
