package programiz.javaooptwo.abstraction;

public class PersonBuilder {
    public static Person buildPerson(String name, int age){
        if(age >= 18){
            return new Teacher(name, age);
        }else{
            return new Student(name, age);
        }
    }
}
