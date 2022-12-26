package programiz.javaoopone.overloading;

public class MethodOverloading {
    // changing the return type we can not achieve method overloading

    //Overloading by changing the number of parameters
    public void display(){
        System.out.println("No argument");
    }
    public void display(double weight){
        System.out.println("To display weight in decimal " + weight);
    }

    //Method Overloading by changing the data type of parameters

    public void display(String name){
        System.out.println(name.getClass().getName());
    }


    //Overloading by changing the sequence of parameters
    public void display(int id, String name){
        System.out.println("name " + name + " id " + id );
    }
    public void display(String name, int id){
        System.out.println("Changing the sequence of id an name");
    }
}
