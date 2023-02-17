package designpattern.abstractfactory.classes;

public class VerticalLine implements Line{
    public void drawLine(){
        System.out.println("Drawing vertical line");
    }

    @Override
    public void drawPicture() {
        System.out.println("Drawing vertical line");
    }
}
