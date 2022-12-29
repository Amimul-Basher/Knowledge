package programiz.javaooptwo.abstraction;

public class AbstractClassTest {
    public static void main(String[] args){
       Person p1 = PersonBuilder.buildPerson("Ayaat", 2);
       Person p2 = PersonBuilder.buildPerson("Ranju", 52);
       p1.jobType();
       p2.jobType();
    }
}

