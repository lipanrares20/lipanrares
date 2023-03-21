package ro.ase.factorymethod;

public class FactoryTramvai implements IFactory {
    @Override
    public TransportVehicle createVehicle(int noSeats) {
        return new Tramvai(noSeats);
    }
}
