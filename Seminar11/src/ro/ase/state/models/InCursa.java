package ro.ase.state.models;

public class InCursa implements IBusState {
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof LaCapatDeLinie) {
            System.out.println("Autobuzul "+bus.getLicensePlate()+" a inceput cursa.");
            bus.setState(this);
        } else {
            System.out.println("Nu se poate incepe cursa. Autobuzul este "+bus.getState());
        }
    }
}
