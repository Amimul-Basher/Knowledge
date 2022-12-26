package programiz.javaoopone.overloading;

public class TestOverloading {
    public static void main (String[] args){
        MethodOverloading mo = new MethodOverloading();
        mo.display();
        mo.display("name");
        mo.display(2);
        mo.display(12, "Amimul");
        mo.display("Amimul", 12);
        ConstructorOverloading co1 = new ConstructorOverloading(12);
        ConstructorOverloading co2 = new ConstructorOverloading("Amimul");
        ConstructorOverloading co3 = new ConstructorOverloading(12,"Amimul");

    }
}
