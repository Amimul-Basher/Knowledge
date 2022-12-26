package programiz.javaoopone.classobject;

public class Teacher {

    //fields and methods is the member of a class

    //state or field
    public String name;
    public String subject;

    //behavior or method
    public void teaches(){
        System.out.println(name + " teaches " + subject);
    }

    // Create objects inside the same class
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.name = "Abul Hossain";
        teacher.subject = "Math";
        teacher.teaches();
    }
}
