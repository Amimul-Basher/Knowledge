package programiz.javaoopone.method;

import java.util.ArrayList;

public class Bike {
    //advantages: code reusability, readable and easier
    //return type
    //method name
    //parameter
    //body
    static int speed;
    public int accelerate(){
        System.out.println("Current speed "+ speed);
        return speed+=5;
    }
    public void countAverageSpeed(int... speeds){
        int len = speeds.length;

        int count = 0;
        for(int i : speeds){
            count+= i;
        }
        System.out.println("Average Speed " + count/len);
    }

    public static void main(String[] args){

        speed = 10;
        int[] speeds = new int[10];
        Bike bike = new Bike();
        speeds[0] = bike.accelerate();
        speeds[1] = bike.accelerate();
        speeds[2] = bike.accelerate();
        speeds[3] = bike.accelerate();
        bike.countAverageSpeed(speeds);
    }
}
