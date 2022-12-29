package programiz.javaooptwo.Inheritance;

public class Animal {
    public String name;
    private String food;

    public Animal(String name, String food) {
        this.name = name;
        this.food = food;
        System.out.println("Animal constructor called");
        //Passing object as reference
        printClassification(this);
    }

    //Static or final method can not be overridden by subclasses
    //Question to yourself why static is used?
    final static void printClassification(Animal animal){
        System.out.println(animal.name + " is a Animal");
    }

    protected void eat(){
        System.out.println(name + " eats " + food);
    }
}
