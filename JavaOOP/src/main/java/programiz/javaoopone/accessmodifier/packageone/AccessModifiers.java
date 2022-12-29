package programiz.javaoopone.accessmodifier.packageone;

public class AccessModifiers {
    public String name;
    private int id;
    //won't allow anyone to get the age outside this package except who inherits
    protected String dream;



    //won't allow anyone to set id outside of this package
    int age;
    void setId(int id){  //default method
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "AccessModifiers{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dream='" + dream + '\'' +
                ", age=" + age +
                '}';
    }
}
class DefaultClass{
    public DefaultClass(){
        System.out.println("This is default class");
    }
}
