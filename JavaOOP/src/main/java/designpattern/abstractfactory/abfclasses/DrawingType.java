package designpattern.abstractfactory.abfclasses;

public class DrawingType {
    public static enum ColorType{
        Blue, Green, Red;
        public static boolean contains(String type){
            for(ColorType st: ColorType.values()){
                if(st.toString().equals(type)) return true;
            }
            return false;
        }
    }
    public static enum ShapeType{
        Rectangle, Triangle, Circle;
        public static boolean contains(String type){
            for(ShapeType st: ShapeType.values()){
                if(st.toString().equals(type)) return true;
            }
            return false;
        }
    }
    public static enum LineType{
        Vertical, Horizontal, Straight;
        public static boolean contains(String type){
            for(LineType st: LineType.values()){
                if(st.toString().equals(type)) return true;
            }
            return false;
        }
    }
}
