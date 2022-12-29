package programiz.javaooptwo.Inheritance;

public class test {
    public static void main(String[] args){
        //Polymorphism
        Animal squirrel = new Squirrel("Pultu", "fruits and grains", 32);
        squirrel.eat();

        //Question to yourself. Why to cast?
        ((Squirrel) squirrel).moves();
        //Why animal itself is used to call the method?
        Animal.printClassification(squirrel);
    }
}
