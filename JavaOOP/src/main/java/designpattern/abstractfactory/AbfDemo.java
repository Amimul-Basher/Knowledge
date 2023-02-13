package designpattern.abstractfactory;

import designpattern.abstractfactory.abfclasses.AbstractFactory;
import designpattern.abstractfactory.abfclasses.FactoryCreator;
import designpattern.abstractfactory.classes.Color;
import designpattern.abstractfactory.classes.Shape;

public class AbfDemo {
    public static void main(String[] args){
        System.out.println("Creating shape using shape factory...................");
        FactoryCreator factoryCreator = new FactoryCreator();
        AbstractFactory abstractFactory = factoryCreator.createFactory("ShapeFactory");
        Shape shape = abstractFactory.getShpae("Rectangle");
        shape.drawShape();

        System.out.println("Taking color using color factory...................");
        AbstractFactory abstractFactory1 = factoryCreator.createFactory("ColorFactory");
        Color color = abstractFactory1.getColor("Green");
        color.fillColor();

    }
}
