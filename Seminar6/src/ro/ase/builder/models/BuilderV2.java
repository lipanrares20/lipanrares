package ro.ase.builder.models;

public class BuilderV2 implements IAbstractBuilder {
    private boolean isNearWindow;
    private boolean isErgoChairs;

    private boolean isDecoratedTable;
    private boolean isAmbientalMusic;
    private String musicGenre;

    @Override
    public Rezervation getReservation() {
        return new Rezervation(isNearWindow,isErgoChairs,isDecoratedTable,isAmbientalMusic,musicGenre);
    }

    public BuilderV2() {
        this.isNearWindow = false;
        this.isErgoChairs = false;
        this.isDecoratedTable = false;
        this.isAmbientalMusic = false;
        this.musicGenre = null;
    }

    @Override
    public IAbstractBuilder setIsNearWindow(Boolean isNearWindow) {
        this.isNearWindow = isNearWindow;
        return this;
    }

    @Override
    public IAbstractBuilder setIsErgoChairs(boolean ergoChairs) {
        this.isErgoChairs = ergoChairs;
        return this;
    }

    @Override
    public IAbstractBuilder setIsDecoratedTable(boolean decoratedTable) {
        this.isDecoratedTable = false;
        return this;
    }

    @Override
    public IAbstractBuilder setIsAmbientalMusic(boolean ambientalMusic) {
        this.isAmbientalMusic = false;
        return this;
    }

    @Override
    public IAbstractBuilder setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
        return this;
    }
}
