package programiz.javaoopthree.anonymousclass;

//Details of anonymous class : https://www.programiz.com/java-programming/anonymous-class
//Using anonynous class we can create object class whenever its needed
//Provides plug and play feature :)

class Parent{
    void display(){
        System.out.println("It's anonymous parent class");
    }
}

class AnonymousDemo{
    Parent child  = new Parent(){
        @Override
        void display() {
            System.out.println("Calling display method of parent class");
            super.display();
            System.out.println("It's overridden method of anonymous class");
        }
    };
}
public class AnonymousExtends {
    public static void main(String[] args){
        AnonymousDemo anonymousDemo = new AnonymousDemo();
        anonymousDemo.child.display();
    }
}
