package ro.ase.builder.models;

public class Builder implements IAbstractBuilder {

    private Rezervation reservation;

    public Builder() {
        this.reservation=new Rezervation(false,false,false,false,null);
    }

    @Override
    public Rezervation getReservation() {
        return this.reservation;
    }

    public Builder setIsNearWindow(Boolean isNearWindow)
    {
        this.reservation.setWindowPositioned(isNearWindow);
        return this;
    }

    public Builder setIsErgoChairs(boolean ergoChairs) {
        this.reservation.setHasErgonomicChair(ergoChairs);
        return this;
    }

    public Builder setIsDecoratedTable(boolean decoratedTable) {
        this.reservation.setTableDecorated(decoratedTable);
        return this;
    }

    public Builder setIsAmbientalMusic(boolean ambientalMusic) {
        this.reservation.setHasAmbieltalMusic(ambientalMusic);
        return this;
    }

    public Builder setMusicGenre(String musicGenre) {
        this.reservation.setMusicType(musicGenre);
        return this;
    }

}
