package programiz.javaoopthree.javaenum;
enum Name{
    AFREEN("Afreen Mehjareen"){
        public String toString(){
            return (Name.AFREEN.name() + "'s full name is " + Name.AFREEN.getFullName());
        }
    }, AYAAT("Ayaat Mehjareen"){
        public String toString(){
            return (Name.AYAAT.name() + "'s full name is " + Name.AYAAT.getFullName());
        }
    }, RANJU("Ferdous Ara"){
        public String toString(){
            return (Name.RANJU.name() + "'s full name is " + Name.RANJU.getFullName());
        }
    }, SHAFA("Nehayruma Afroz"){
        public String toString(){
            return (Name.SHAFA.name() + "'s full name is " + Name.SHAFA.getFullName());
        }
    };
    private final String fullName;
    public String getFullName(){
        return this.fullName;
    }
    private Name(String fullName){
        this.fullName = fullName;
    }
}
public class EnumString {
    public static void main(String[] args){
        Name name = Name.SHAFA;
        System.out.println(name);
        System.out.println(name.name());
    }
}
