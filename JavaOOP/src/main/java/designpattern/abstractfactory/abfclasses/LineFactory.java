package designpattern.abstractfactory.abfclasses;

import designpattern.abstractfactory.classes.*;

public class LineFactory extends AbstractFactory{
    public String line;
    public LineFactory(String line){
        this.line = line;
    }
    public Line getPaint(){
        if(line.equals(DrawingType.LineType.Straight.toString())){
            return new StraightLine();
        }else if(line.equals(DrawingType.LineType.Horizontal.toString())){
            return new HorizontalLine();
        }else if(line.equals(DrawingType.LineType.Vertical.toString())){
            return new VerticalLine();
        }else{
            return null;
        }
    }
}
