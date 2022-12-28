package programiz.javaoopone.accessmodifier;

import programiz.javaoopone.accessmodifier.packageone.AccessModifiers;
import programiz.javaoopone.accessmodifier.packageone.TestAccessModifier;

public class TestAccessModifiers extends AccessModifiers {
    public static void main(String[] args){
        AccessModifiers am = new AccessModifiers();
        am.name = "Ayaat";
        //age can not be accessed as its default
//        am.age = 10;
        //This variable is protected. Can be accessed only the class is inherited
//        am.dream = "Doctor";
        System.out.println(am.toString());



        TestAccessModifiers tam = new TestAccessModifiers();
        //Accessed dream as its protected and TestAccessModifiers extends AccessModifier
        tam.dream = "Doctor";
        tam.name = "Azaan";
        System.out.println(tam.getId());
        System.out.println(tam.toString());


        //test default class
//        DefaultClass defaultClass = new DefaultClass();
    }
}
