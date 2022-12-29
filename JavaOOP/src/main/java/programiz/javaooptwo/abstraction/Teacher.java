package programiz.javaooptwo.abstraction;

public class Teacher extends Adult{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void jobType() {
        System.out.println(super.name + " is a housewife and she is the best teacher");
    }
}
