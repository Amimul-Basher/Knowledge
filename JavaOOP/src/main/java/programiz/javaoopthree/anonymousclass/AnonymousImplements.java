package programiz.javaoopthree.anonymousclass;
interface Polygon{
    void display();
    void getArea(int a, int b, int c);
}
interface Structure{
    void display();

}
class Triangle{

    Polygon newTriangle = new Polygon(){
        int a, b, c;
        double s, area;
        public void display(){
            System.out.println("Triangle Created");
        }
        public void getArea(int a, int b, int c){
            double s = 0;
            s = (double )(a + b + c)/2;
            area = Math.sqrt((s-a)*(s-b)*(s- c));
            System.out.println("Area : " + area);
        }
    };


}
class Square{
    public void createSquare(){
        Structure square = new Structure(){
            public void display(){
                System.out.println("Square Created");
            }

        };
        square.display();
    }
}
public class AnonymousImplements {
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.newTriangle.display();
        triangle.newTriangle.getArea(4, 2, 3);
        Square square = new Square();
        square.createSquare();
    }

}
