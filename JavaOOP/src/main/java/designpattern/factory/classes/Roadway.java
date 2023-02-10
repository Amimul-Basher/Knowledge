package designpattern.factory.classes;

public class Roadway implements Transportation{
    @Override
    public int definePlatoonSize(int size) {
        return 0;
    }

    @Override
    public void getVehicle() {
        System.out.println("Platoon forwarding with tank by road");
    }
}
