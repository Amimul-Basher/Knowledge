package designpattern.factory.factoryclasses;

import designpattern.factory.classes.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransportFactory {
    public Transportation getTransport(String transportType){
        if(transportType.equals("Bus")){
            return new Bus();
        }else if(transportType.equals("Car")){
            return new Car();
        }else if(transportType.equals("Boat")){
            return new Boat();
        }else{
            return null;
        }
    }
    public Transportation getTransportReflection(String transportType) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Transportation ts = null;

        Class transportationTypes = TransportationTypes.class;
        System.out.println(transportationTypes.getEnumConstants());
        for(Object e : transportationTypes.getEnumConstants()){
            if(e.toString().equals(transportType)){
                Method m = e.getClass().getDeclaredMethod("getTransportation");
                //Even being public the method can not be accessed as it is in different package
                m.setAccessible(true);
                ts = (Transportation) m.invoke(e);
            }
        }
        return ts;
    }

}
