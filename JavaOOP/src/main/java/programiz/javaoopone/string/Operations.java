package programiz.javaoopone.string;

public class Operations {

    //String .equals checks whether the content is same
    //String == checks whether the reference are same
    public void compareTwoString(String one, String two){
        if(one.equals(two)){
             System.out.println("Both are same");
        }else{
             System.out.println("They are not same");
        };
    }
    public void concatTwoString(String one, String two){
        System.out.println(one.concat(two));
    }
    public void findLength(String one){
        System.out.println("The length of " + one + " is " + one.length());
    }

    public static void main(String[] args){
        Operations op = new Operations();
        op.compareTwoString("Amimul", "Basher");
        op.concatTwoString("Amimul ", "Basher");
        op.findLength("Do work for me");
    }
}
