package designpattern.notification.factories;

import java.lang.reflect.Method;

public class FactoryManager {
    public AbstractFactory getFactory(String type){
        try{
            Class factoryTypes =  FactoryTypes.class;
            for(Object c: factoryTypes.getEnumConstants()){
                if(c.toString().equals(type)){
                    Method method = c.getClass().getDeclaredMethod("getFactory");
                    System.out.println("Method found");
                    return (AbstractFactory) method.invoke(c);
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }


        return null;
    }
}
