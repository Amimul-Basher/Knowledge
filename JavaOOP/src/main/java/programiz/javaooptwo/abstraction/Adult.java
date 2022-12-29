package programiz.javaooptwo.abstraction;

public abstract class Adult extends Person{

    public Adult(String name, int age) {
        super(name, age);
        System.out.println("Adult constructor called");
    }

    @Override
    public void ageInfo(){
        System.out.println(super.name + " is an adult person");
    }
    @Override
    public abstract void jobType();
}
