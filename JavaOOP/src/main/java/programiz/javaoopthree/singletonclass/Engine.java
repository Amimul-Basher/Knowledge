package programiz.javaoopthree.singletonclass;

public class Engine {
    private String name;
    private static Engine engine;
    private Engine(String name){
        this.name = name;
    }
    private Engine(){

    }
    public void display(){
        System.out.println(this.name + " Engine Created");
    }
    public static Engine createEngine(String name){
        if(engine == null){
            //you can not create and return rather assign it to the static engine variable
            //It's not singleton untill you assign
            engine =  new Engine(name);
        }
        return engine;
    }
}
