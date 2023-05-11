package ro.ase.strategy.main;

import ro.ase.strategy.models.Calator;
import ro.ase.strategy.models.PlataCardBancar;
import ro.ase.strategy.models.PlataCardCalatorii;
import ro.ase.strategy.models.PlataSms;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Meran Eugen", 8);
        calator.platesteBilet(3);
        calator.setMetodaPlata(new PlataSms());
        calator.platesteBilet(2.5);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(3.5);
        calator.setMetodaPlata(new PlataCardCalatorii());
    }
}
