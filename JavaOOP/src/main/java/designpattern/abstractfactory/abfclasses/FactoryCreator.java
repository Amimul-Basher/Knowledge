package designpattern.abstractfactory.abfclasses;

public class FactoryCreator {
    public AbstractFactory createFactory(String factoryName){
        if(factoryName == "ShapeFactory"){
            return new ShapeFactory();
        }else if(factoryName == "ColorFactory"){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
