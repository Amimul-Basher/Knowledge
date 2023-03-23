package designpattern.factory.classes;

public interface Transportation {
    public int definePlatoonSize(int size);
    public void getVehicle();
    default void moveToDestination(String destination){
        System.out.println("" +
                "Started journey towards " + destination);
    }
}
