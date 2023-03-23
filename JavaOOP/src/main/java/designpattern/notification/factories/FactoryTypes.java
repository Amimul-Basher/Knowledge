package designpattern.notification.factories;

public enum     FactoryTypes {
    Mobile{
        public AbstractFactory getFactory(){return new MobileNotificationFactory();}
    }, Mail{
        public AbstractFactory getFactory(){return new MailNotificationFactory();}
    }, Dashboard{
        public AbstractFactory getFactory(){return new DashboardNotificationFactory();}
    };

    public abstract AbstractFactory getFactory();
}
