package programiz.javaoopone.constructor;

public class Cow extends Animal{
    String gender;
    public Cow(String name, int age, String gender){
        //call constructor from another constructor
        this(name, age);
        this.gender = gender;
        System.out.println(name + " is " + gender);
    }

    public Cow(String name, int age){
            //Call constructor from superclass
            super(name, age);
    }
    public Cow(){}
    public static void main(String[] args){
        Cow cow = new Cow("Hamba", 10);
        Cow cow2 = new Cow();
        Cow cow3 = new Cow("Goru", 2, "Female");
    }
}
