package designpattern.abstractfactory.classes;

import org.w3c.dom.ls.LSOutput;

public class StraightLine implements Line{
    public void drawLine(){
        System.out.println("Drawing a straight Line");
    }

    @Override
    public void drawPicture() {
        System.out.println("Drawing a straight Line");
    }
}
