package designpattern.abstractfactory.classes;

public class HorizontalLine implements Line{
    public void drawLine(){
        System.out.println("Drawing horizontal Line");
    }

    @Override
    public void drawPicture() {
        System.out.println("Drawing horizontal Line");
    }
}
