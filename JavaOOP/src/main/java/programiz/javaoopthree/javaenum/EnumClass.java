package programiz.javaoopthree.javaenum;
enum Size{
    SMALL, MEDIUM, LARGE, EXTRALARGE;
    public String getSize(){
        switch (this){
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRALARGE:
                return "extra large";
            default:
                return null;
        }
    }
}
public class EnumClass {
    public static void main(String[] args){
        System.out.println("S for " + Size.SMALL.getSize());
        System.out.println("M for " + Size.MEDIUM.getSize());
        System.out.println("L for "+ Size.LARGE.getSize());
        System.out.println("XL for " + Size.EXTRALARGE.getSize());
    }
}
