package ro.ase.state.models;

public class LaReparat implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul "+bus.getLicensePlate()+" e trimit in service.");
            bus.setState(this);
        } else {
            System.out.println("Nu se poate trimite inca in service. Autobuzul este "+bus.getState());
        }
    }
}
