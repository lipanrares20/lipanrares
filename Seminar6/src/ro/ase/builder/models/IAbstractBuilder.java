package ro.ase.builder.models;

public interface IAbstractBuilder {
    public Rezervation getReservation();

    public IAbstractBuilder setIsNearWindow(Boolean isNearWindow);

    public IAbstractBuilder setIsErgoChairs(boolean ergoChairs);

    public IAbstractBuilder setIsDecoratedTable(boolean decoratedTable);

    public IAbstractBuilder setIsAmbientalMusic(boolean ambientalMusic);

    public IAbstractBuilder setMusicGenre(String musicGenre);
}
