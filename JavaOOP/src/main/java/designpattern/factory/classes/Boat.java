package designpattern.factory.classes;

public class Boat implements Transportation{
    @Override
    public int definePlatoonSize(int size) {
        return 0;
    }

    @Override
    public void getVehicle() {
        System.out.println("Let's move to the destination by Boat");
    }
}
