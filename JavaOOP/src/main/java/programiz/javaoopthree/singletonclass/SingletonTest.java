package programiz.javaoopthree.singletonclass;


//Both Engine points to the same instance
public class SingletonTest {
    public static void main(String[] args){
        Engine engine = Engine.createEngine("Combustion");
        engine.display();
        Engine enginetwo = Engine.createEngine("Electrical");
        enginetwo.display();
    }
}
