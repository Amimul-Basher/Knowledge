package designpattern.abstractfactory.abfclasses;

public class FactoryManager {
    public AbstractFactory createFactory(String type){
        if(DrawingType.ShapeType.contains(type)){
            return new ShapeFactory(type);
        }else if(DrawingType.ColorType.contains(type)){
            return new ColorFactory(type);
        }else if(DrawingType.LineType.contains(type)){
            return new LineFactory(type);
        }else{
            return null;
        }
    }
}
