package by.task2.transports.typesTransport;

import by.task2.transports.abstracts.Vehicles;
import by.task2.transports.interfaces.IVehicles;

public class Airplane extends Vehicles implements IVehicles {
    public Airplane(String name, int wheels, int screws) {
        super(name, wheels, screws, 2);
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasScrew() {
        return true;
    }

    @Override
    public boolean hasWings() {
        return true;
    }

    @Override
    public String carriesCargo() {
        return "Airplane is carries cargo";
    }
}
