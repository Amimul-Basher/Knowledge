package programiz.javaooptwo.abstraction;

public abstract class Person {
    public String name;
    public int age;
    public Person(String name, int age){
        this.age = age;
        this.name = name;
        System.out.println("Person constructor called");
    }
    public void showDescription(){
        System.out.println(this.name + " is " + this.age + " years old");
    }
    public abstract void ageInfo();
    public abstract void jobType();
}
