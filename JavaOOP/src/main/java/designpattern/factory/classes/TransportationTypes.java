package designpattern.factory.classes;


public enum TransportationTypes {
    Bus{
        @Override
        public Transportation getTransportation(){
            return new Bus();
        }
    },
    Car{
        @Override
        public Transportation getTransportation(){
            return new Car();
        }
    },
    Boat{
        @Override
        public Transportation getTransportation(){
            return new Boat();
        }
    };
    public abstract Transportation getTransportation();
}
