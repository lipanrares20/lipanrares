package ro.ase.builder.models;

public class BuilderI implements IAbstractBuilder {

    Rezervation rezervation;
    @Override
    public Rezervation getReservation() {
        return rezervation;
    }

    public BuilderI() {
        rezervation = new Rezervation(false, false, false, false,  null);
    }

    public BuilderI setIsAtWindow(boolean isAtWindow) {
        rezervation.setWindowPositioned(isAtWindow);
        return this;
    }

    public BuilderI setHasErgonomicChairs(boolean hasErgonomicChairs) {
        rezervation.setHasErgonomicChair(hasErgonomicChairs);
        return this;
    }

    public BuilderI setIsTableDecorated(boolean isTableDecorated) {
        rezervation.setTableDecorated(isTableDecorated);
        return this;
    }

    public BuilderI setHasAmbientalMusic(boolean hasAmbientalMusic) {
        rezervation.setHasAmbieltalMusic(hasAmbientalMusic);
        return this;
    }

    public BuilderI setMusicType(String musicType) {
        rezervation.setMusicType(musicType);
        return this;
    }

}
