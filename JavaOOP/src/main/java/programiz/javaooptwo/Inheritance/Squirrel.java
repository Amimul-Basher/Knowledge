package programiz.javaooptwo.Inheritance;

public class Squirrel extends Animal {
    private int speed;
    public Squirrel(String name, String food, int speed){
        super(name, food);
        this.speed = speed;
        System.out.println("Squirrel constructor called");
    }
    public void moves(){
        System.out.println(super.name + " moves " + this.speed + " km/hour");
    }
    //Overrides with different access modifier
    @Override
     public void eat(){
        //Accessing parent class method using super keyword
        super.eat();
        System.out.println("They are very clever. It stay alert while eating");
    }
}
