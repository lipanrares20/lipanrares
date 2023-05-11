package ro.ase.state.models;

public class LaCapatDeLinie implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof InCursa) {
            System.out.println("Autobuzul "+bus.getLicensePlate()+" reached the end of line.");
            bus.setState(this);
        } else {
            System.out.println("Nu se poate aduce la capat de linie. Autobuzul este "+bus.getState());
        }
    }
}
