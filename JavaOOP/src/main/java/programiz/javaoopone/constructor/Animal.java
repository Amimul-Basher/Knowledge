package programiz.javaoopone.constructor;

public class Animal {

    //Three types of constructor : Default, No argument, Argument
    //If you declare an argument constructor then declaring no argument constructor is better to declare
    //The default constructor initializes instance variables with default values.

    String name;
    int age;
    public Animal(){
        System.out.println("No name and age mentioned");
    }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name " + name + " Age " + age);
    }

}

