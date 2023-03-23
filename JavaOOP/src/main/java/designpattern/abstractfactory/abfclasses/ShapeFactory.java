package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.*;

public class ShapeFactory extends AbstractFactory{
    public String shape;
    public ShapeFactory(String shape){
        this.shape = shape;
    }
    @Override
    public Shape getPaint() {
        if (this.shape.equals(DrawingType.ShapeType.Circle.toString())){
            return new Circle();
        }else if(this.shape.equals(DrawingType.ShapeType.Triangle.toString())){
            return new Triangle();
        }else if(this.shape.equals(DrawingType.ShapeType.Rectangle.toString())){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
