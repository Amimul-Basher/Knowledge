package designpattern.factory;

import designpattern.factory.classes.Transportation;
import designpattern.factory.factoryclasses.TransportFactory;

public class test {
    public static void main(String[] args){
        TransportFactory transportFactory = new TransportFactory();
        Transportation transportation = transportFactory.getTransport("Roadway");
        transportation.getVehicle();
        transportation.moveToDestination("West Bengal");

    }
}
