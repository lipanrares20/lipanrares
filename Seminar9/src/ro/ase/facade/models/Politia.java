package ro.ase.facade.models;

public class Politia {
    public Boolean areCazier(String cnp) {
        return (cnp.charAt(cnp.length() - 1) % 2 == 0);
    }
}
