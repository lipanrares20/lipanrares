package ro.ase.factorymethod;

public class Autobuz extends TransportVehicle {
    public Autobuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("Autobuzul"+super.toString());
    }

    @Override
    public void movingType() {
        System.out.println("Pe roti");
    }
}
