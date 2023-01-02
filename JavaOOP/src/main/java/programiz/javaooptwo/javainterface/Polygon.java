package programiz.javaooptwo.javainterface;
//All methods in an interface implicitly public and all fields are implicitly public static final
//Achieve abstraction in java
//Provide specification for the child class to follow.
//After java 8 default method is introduced in Java. Why to check https://www.programiz.com/java-programming/interfaces
//The Java 8 also added another feature to include static methods inside an interface.

public interface Polygon {

    void getArea();
    void getPerimeter();
    //Default method
    default void getPerimeter(int... sides){
        int perimeter = 0;
        for(int side : sides){
            perimeter += side;
        }
        System.out.println("Perimeter : " + perimeter);
    };


    //Static method
    static void findType(){
        System.out.println("It's a polygon Interface");
    }

    //private method
    //All other methods and fields are public by default
    private void info(){
        System.out.println("This interface have all the method typed declared");
    }




}
