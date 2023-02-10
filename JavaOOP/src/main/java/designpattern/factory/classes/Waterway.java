package designpattern.factory.classes;

public class Waterway implements Transportation{
    @Override
    public int definePlatoonSize(int size) {
        return 0;
    }

    @Override
    public void getVehicle() {
        System.out.println("Platoon forwarding with submarine");
    }
}
