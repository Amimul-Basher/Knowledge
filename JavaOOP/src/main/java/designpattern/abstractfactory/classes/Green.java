package designpattern.abstractfactory.classes;

public class Green implements Color{
    @Override
    public void fillColor(){
        System.out.println("Green color filled");
    }
    @Override
    public void drawPicture(){
        System.out.println("Green color filled");
    }
}
