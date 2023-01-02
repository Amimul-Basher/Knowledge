package programiz.javaooptwo.javainterface;

public class Triangle implements Polygon{
    private int a, b, c;
    private double s, area;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.s = 0;
    }

    @Override
    public void getArea() {
        s = (double)(a+b+c)/2;
        area = Math.sqrt((s-a)*(s-b)*(s-c));
        System.out.println("Area : " + area);
    }

    //Can override the default method
    //Overloading is also implemented here
    @Override
    public void getPerimeter() {
        //Don't know why need to use Polygon at the beginning ***
        Polygon.super.getPerimeter(this. a, this. b, this.c);
    }


}
