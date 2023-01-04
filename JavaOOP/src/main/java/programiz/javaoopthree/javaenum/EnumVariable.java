package programiz.javaoopthree.javaenum;
enum Color{
    RED, GREEN, BLUE
}
enum Person{
    ADULT, BOY, GIRL
}
class TeaShirt {
    public Person person;

    public TeaShirt(Person person){
        this.person = person;
    }
    public Color chooseTeaShirt(){
        switch(person){
            case BOY:
                return Color.BLUE;
            case GIRL:
                return Color.RED;
            case ADULT:
                return Color.GREEN;
            default:
                return null;
        }
    }
}
