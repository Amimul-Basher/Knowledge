package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.*;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShpae(String shape) {
        if (shape == "Circle"){
            return new Circle();
        }else if(shape == "Triangle"){
            return new Triangle();
        }else if(shape == "Rectangle"){
            return new Rectangle();
        }else{
            return null;
        }
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
