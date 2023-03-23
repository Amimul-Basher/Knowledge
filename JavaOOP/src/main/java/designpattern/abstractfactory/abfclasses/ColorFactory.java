package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.*;

public class ColorFactory extends AbstractFactory{
    public String color;
    public ColorFactory(String color){
        this.color = color;
    }

    @Override
    public Color getPaint(){
        if (this.color.equals(DrawingType.ColorType.Red.toString())){
            return new Red();
        }else if(this.color.equals(DrawingType.ColorType.Green.toString())){
            return new Blue();
        }else if(this.color.equals(DrawingType.ColorType.Blue.toString())){
            return new Green();
        }else{
            return null;
        }

    }

}
