package designpattern.abstractfactory;

import designpattern.abstractfactory.abfclasses.AbstractFactory;
import designpattern.abstractfactory.abfclasses.FactoryManager;
import designpattern.abstractfactory.classes.Color;
import designpattern.abstractfactory.classes.Paint;
import designpattern.abstractfactory.classes.Shape;

public class AbfDemo {
    public static void main(String[] args){

        FactoryManager factoryCreator = new FactoryManager();

        System.out.println("Creating shape using shape factory...................");

        Paint shape = factoryCreator.createFactory("Circle").getPaint();
        shape.drawPicture();

        System.out.println("Taking color using color factory...................");

        Paint color = factoryCreator.createFactory("Red").getPaint();
        color.drawPicture();
    }
}
