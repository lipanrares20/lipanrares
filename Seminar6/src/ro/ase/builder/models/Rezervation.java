package ro.ase.builder.models;

public class Rezervation {
    private boolean isWindowPositioned;
    private boolean hasErgonomicChair;
    private boolean isTableDecorated;
    private boolean hasAmbieltalMusic;
    private String musicType;

    public Rezervation(boolean isWindowPositioned, boolean hasErgonomicChair, boolean isTableDecorated, boolean hasAmbieltalMusic, String musicType) {
        this.isWindowPositioned = isWindowPositioned;
        this.hasErgonomicChair = hasErgonomicChair;
        this.isTableDecorated = isTableDecorated;
        this.hasAmbieltalMusic = hasAmbieltalMusic;
        this.musicType = musicType;
    }

    public void setWindowPositioned(boolean windowPositioned) {
        isWindowPositioned = windowPositioned;
    }

    public void setHasErgonomicChair(boolean hasErgonomicChair) {
        this.hasErgonomicChair = hasErgonomicChair;
    }

    public void setTableDecorated(boolean tableDecorated) {
        isTableDecorated = tableDecorated;
    }

    public void setHasAmbieltalMusic(boolean hasAmbieltalMusic) {
        this.hasAmbieltalMusic = hasAmbieltalMusic;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    @Override
    public String toString() {
        return "Rezervation{" +
                "isWindowPositioned=" + isWindowPositioned +
                ", hasErgonomicChair=" + hasErgonomicChair +
                ", isTableDecorated=" + isTableDecorated +
                ", hasAmbieltalMusic=" + hasAmbieltalMusic +
                ", musicType='" + musicType + '\'' +
                '}';
    }
}
