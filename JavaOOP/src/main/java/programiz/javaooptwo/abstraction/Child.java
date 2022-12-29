package programiz.javaooptwo.abstraction;

public abstract class Child extends Person {
    public Child(String name, int age) {
        super(name, age);
    }
    @Override
    public void ageInfo(){
        System.out.println(super.name + " is a child");
    }
    @Override
    public abstract void jobType();
}
