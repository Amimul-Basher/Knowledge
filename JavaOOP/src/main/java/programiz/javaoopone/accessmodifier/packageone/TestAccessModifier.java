package programiz.javaoopone.accessmodifier.packageone;

public class TestAccessModifier {
    public static void main(String[] args){
        AccessModifiers am = new AccessModifiers();
        am.age = 10;
        am.dream = "Doctor";
        am.name = "Afreen";
        //private variable can not be accessed outside of its class
//        am.id = 1;
        am.setId(1);
        System.out.println(am.toString());


        //test default class
        DefaultClass defaultClass = new DefaultClass();

    }
}
