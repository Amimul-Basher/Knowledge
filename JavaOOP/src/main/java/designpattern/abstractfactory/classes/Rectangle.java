package designpattern.abstractfactory.classes;

public class Rectangle implements Shape {
    @Override
    public void drawShape(){
        System.out.println("Rectangle shape is drawn");
    }
    @Override
    public void drawPicture() {
        System.out.println("Rectangle shape is drawn");
    }
}
