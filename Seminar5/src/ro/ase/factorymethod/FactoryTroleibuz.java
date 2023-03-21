package ro.ase.factorymethod;

public class FactoryTroleibuz implements IFactory {
    @Override
    public TransportVehicle createVehicle(int noSeats) {
        return new Troleibuz(noSeats);
    }
}
