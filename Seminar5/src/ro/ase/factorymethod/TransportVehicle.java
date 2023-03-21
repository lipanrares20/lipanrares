package ro.ase.factorymethod;

public abstract class TransportVehicle {
    protected int noSeats;
    public abstract void showInfo();
    public abstract void movingType();

    public TransportVehicle(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public String toString() {
        return " has" + noSeats+" seats.";
    }
}
