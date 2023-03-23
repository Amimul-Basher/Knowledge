package designpattern.abstractfactory.classes;

public class Triangle implements Shape{
    @Override
    public void drawShape(){
        System.out.println("Triangle shape is drawn");
    }
    @Override
    public void drawPicture() {
        System.out.println("Triangle shape is drawn");
    }
}
