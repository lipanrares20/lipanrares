package ro.ase.prototype.main;

import ro.ase.prototype.models.Client;
import ro.ase.prototype.models.IAbstractInterface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        IAbstractInterface client = new Client("Andrei","070707","andrei@andrei");
        IAbstractInterface clien2 = client.createACopy();
        System.out.println(client.toString());
        System.out.println(clien2.toString());
    }
}
