package designpattern.abstractfactory.abfclasses;


import java.lang.reflect.Method;

public class FactoryManager {
    private DrawingType[] enums;

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
    public AbstractFactory createReflectionFactory(String type){
        try{
            for(Class e: DrawingType.class.getClasses()){
//            System.out.println(e.getSimpleName());
                for(Object c: e.getEnumConstants()){
                    if(c.toString().equals(type)){
                        Method getFactory =  c.getClass().getDeclaredMethod("getFactory", String.class);
                        return (AbstractFactory) getFactory.invoke(null, type);
                    }
//                DrawingType.ShapeType.Circle.getFactory(type);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return null;

    }

}
