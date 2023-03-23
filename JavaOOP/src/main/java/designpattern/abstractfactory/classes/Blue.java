package designpattern.abstractfactory.classes;

public class Blue implements Color{
    public void fillColor(){
        System.out.println("Blue color filled");
    }
    @Override
    public void drawPicture(){
        System.out.println("Blue color filled");
    }
}
