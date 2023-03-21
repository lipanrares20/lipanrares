package ro.ase.factorymethod;

public class FactoryAutobuz implements IFactory {
    @Override
    public TransportVehicle createVehicle(int noSeats) {
        return new Autobuz(noSeats);
    }
}
