package programiz.javaoopthree.javaenum;
//Why enum?
//Compile time type safety. If you try to assign values other than defined constants
//Suppose you want the value of a variable to be in between a range of values
//There have some default method of enum class
//We can also override those methods except name. name() method is declared as final
//Enum constructor is delightful. Check the example
public class EnumTest {
    public static void main(String[] args){
        TeaShirt teaShirtOne = new TeaShirt(Person.BOY);
        System.out.println(teaShirtOne.person + " should ware " +teaShirtOne.chooseTeaShirt());
        TeaShirt teaShirtTwo = new TeaShirt(Person.ADULT);
        System.out.println(teaShirtTwo.person + " should ware " +teaShirtTwo.chooseTeaShirt());
        TeaShirt teaShirtThree = new TeaShirt(Person.GIRL);
        System.out.println(teaShirtThree.person + " should ware " +teaShirtThree.chooseTeaShirt());
        System.out.println(Color.GREEN.ordinal()); //We can find a integer value of constant as well using ordinal :)
    }
}
