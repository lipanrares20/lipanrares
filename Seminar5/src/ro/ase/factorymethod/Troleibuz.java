package ro.ase.factorymethod;

public class Troleibuz extends TransportVehicle {
    public Troleibuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("Troileibuzul"+super.toString());
    }

    @Override
    public void movingType() {
        System.out.println("Pe curent");
    }
}
