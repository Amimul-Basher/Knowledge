package designpattern.factory.factoryclasses;

import com.sun.jdi.connect.Transport;
import designpattern.factory.classes.Airway;
import designpattern.factory.classes.Roadway;
import designpattern.factory.classes.Transportation;
import designpattern.factory.classes.Waterway;

public class TransportFactory {
    public Transportation getTransport(String transportType){
        if(transportType.equals("Airways")){
            return new Airway();
        }else if(transportType.equals("Roadway")){
            return new Roadway();
        }else if(transportType.equals("Waterway")){
            return new Waterway();
        }else{
            return null;
        }
    }

}
