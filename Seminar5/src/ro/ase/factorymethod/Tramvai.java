package ro.ase.factorymethod;

public class Tramvai extends TransportVehicle {
    public Tramvai(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("Tramvaiul"+super.toString());
    }

    @Override
    public void movingType() {
        System.out.println("Pe sine");
    }
}
