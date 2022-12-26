package programiz.javaoopone.overloading;

public class ConstructorOverloading {
    public ConstructorOverloading(int id){
        System.out.println("Where is the name? :D ");
    }
    public ConstructorOverloading(String name){
        System.out.println("Where is the id? :D");
    }
    public ConstructorOverloading(int id, String name){
        System.out.println("Name and id found " + name + " " + id);
    }
}
