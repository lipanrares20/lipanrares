package ro.ase.state.models;

public class Bus {
    private IBusState state;
    private String licensePlate;

    public Bus(String licensePlate) {
        this.state = new LaCapatDeLinie();
        this.licensePlate = licensePlate;
    }

    public IBusState getState() {
        return state;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    protected void setState(IBusState state) {
        this.state = state;
    }

    public void pleacaInCursa() {
        IBusState incursa = new InCursa();
        incursa.changeState(this);
    }

    public void pleacaLaCapatDeLinie() {
        IBusState laCapatDeLinie = new LaCapatDeLinie();
        laCapatDeLinie.changeState(this);
    }

    public void pleacaInService() {
        IBusState inService = new LaReparat();
        inService.changeState(this);
    }

}
