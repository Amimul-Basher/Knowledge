package programiz.javaoopthree.javaenum;
//Not jsut Declare constants, We can keep some details for each constant. E.g. fruitDetails.
enum Fruit{
    APPLE("This is apple"),
    BANANA("This is Banana"),
    GUAVA("This is Guava"),
    MANGO("This is mango");
    private final String fruitDetails;
    private Fruit(String fruitDetails){
        this.fruitDetails = fruitDetails;
    }
    public String getInfo(){
        return fruitDetails;
    }
}

public class EnumConstructor {
    public static void main(String[] args){
        Fruit fruit = Fruit.BANANA;
        System.out.println(fruit.getInfo());
    }
}
