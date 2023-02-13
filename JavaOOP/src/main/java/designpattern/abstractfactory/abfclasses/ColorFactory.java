package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.*;

public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShpae(String shape) {
        return null;
    }
    @Override
    public Color getColor(String color){
        if (color == "Red"){
            return new Red();
        }else if(color == "Blue"){
            return new Blue();
        }else if(color == "Green"){
            return new Green();
        }else{
            return null;
        }

    }

}
