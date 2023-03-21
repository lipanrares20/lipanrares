package ro.ase.factorymethod;

public interface IFactory {
    public TransportVehicle createVehicle(int noSeats);
}
