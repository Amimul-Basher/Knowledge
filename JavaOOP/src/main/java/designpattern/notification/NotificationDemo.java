package designpattern.notification;


import designpattern.notification.factories.AbstractFactory;
import designpattern.notification.factories.FactoryManager;

public class NotificationDemo {
    public static void main(String[] args){
        FactoryManager factoryManager = new FactoryManager();
        AbstractFactory abf = factoryManager.getFactory("Mobile");
        abf.getNotificationService().sendNotification();
    }
}
