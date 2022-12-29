package programiz.javaooptwo.abstraction;

public class Student extends Child{

    public Student(String name, int age) {
        super(name, age);
        System.out.println("Child constructor called");
    }

    @Override
    public void jobType() {
        System.out.println(super.name + " is a student and she works in Eat Drink and Sleep. Study less");
    }
}
