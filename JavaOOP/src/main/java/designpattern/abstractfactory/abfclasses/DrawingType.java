package designpattern.abstractfactory.abfclasses;

public class DrawingType {

    public static int drawingTypeNo = 3;
    public static enum ColorType{
        Blue, Green, Red;
        public static boolean contains(String type){
            for(ColorType st: ColorType.values()){
                if(st.toString().equals(type)) return true;
            }
            return false;
        }
        public static AbstractFactory getFactory(String type){
            return new ColorFactory(type);
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
        public static AbstractFactory getFactory(String type){
            return new ShapeFactory(type);
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
        public static AbstractFactory getFactory(String type){
            return new LineFactory(type);
        }
    }

}
