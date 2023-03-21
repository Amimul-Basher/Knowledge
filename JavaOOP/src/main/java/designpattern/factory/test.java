package designpattern.factory;

import designpattern.factory.classes.Transportation;
import designpattern.factory.factoryclasses.TransportFactory;

public class test {
    public static void main(String[] args){
        try{
            TransportFactory transportFactory = new TransportFactory();
            Transportation transportation = transportFactory.getTransportReflection("Car");
            transportation.getVehicle();
            transportation.moveToDestination("Dhaka");
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
