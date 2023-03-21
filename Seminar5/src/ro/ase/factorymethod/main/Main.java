package ro.ase.factorymethod.main;

import ro.ase.factorymethod.FactoryAutobuz;
import ro.ase.factorymethod.FactoryTroleibuz;
import ro.ase.factorymethod.IFactory;
import ro.ase.factorymethod.TransportVehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IFactory FAutobuze = new FactoryAutobuz();
        IFactory FTroleibuze = new FactoryTroleibuz();
        List<TransportVehicle> mijloaceTransport = new ArrayList<>();
        mijloaceTransport.add(FAutobuze.createVehicle(10));
        mijloaceTransport.add(FAutobuze.createVehicle(40));
        mijloaceTransport.add(FTroleibuze.createVehicle(20));

        for(TransportVehicle t:mijloaceTransport) {
            t.showInfo();
            t.movingType();
        }
    }
}
