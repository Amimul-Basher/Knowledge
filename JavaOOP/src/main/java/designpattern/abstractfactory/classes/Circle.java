package designpattern.abstractfactory.classes;

public class Circle implements Shape{
    public void drawShape(){
        System.out.println("Circle shape is drawn");
    }
    @Override
    public void drawPicture() {
        System.out.println("Circle shape is drawn");
    }
}
