package ro.ase.builder.main;

import ro.ase.builder.models.Builder;
import ro.ase.builder.models.BuilderV2;
import ro.ase.builder.models.IAbstractBuilder;
import ro.ase.builder.models.Rezervation;

public class Main {
    public static void main(String[] args) {
        IAbstractBuilder reservationBuilder=new Builder();
        reservationBuilder.setIsAmbientalMusic(true).setMusicGenre("Jazz");
        Rezervation reservation=reservationBuilder.getReservation();
        System.out.println(reservation.toString());

        Rezervation reservation1=new Builder().setIsAmbientalMusic(true).setMusicGenre("Minimale").getReservation();
        System.out.println(reservation1.toString());


        IAbstractBuilder builder2=new BuilderV2();
        Rezervation reservation2=builder2.setMusicGenre("Rock").getReservation();
        System.out.println(reservation2.toString());

        Rezervation reservation3=builder2.setMusicGenre("Metal").getReservation();
        System.out.println(reservation3.toString());
    }
}
