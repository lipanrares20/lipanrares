package ro.ase.simplefactory;

public class VehicleFactory {
    public ITransportVehicle createVehicle(VehicleType type, int seats) throws Exception {
        switch (type) {
            case BUS:
                return new Bus(seats);
            case TRAM:
                return new Tram(seats);
            case TROLLEY:
                return new Trolley(seats);
            case SUBWAY:
                return new Subway(seats);
            default:
                throw new Exception("No such type found");
        }
    }
}
