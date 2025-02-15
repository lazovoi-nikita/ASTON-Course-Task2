package by.task2.transports.typesTransport;

import by.task2.transports.abstracts.Vehicles;
import by.task2.transports.interfaces.IVehicles;

public class Helicopter extends Vehicles implements IVehicles {
    public Helicopter(String name, int wheels, int screws) {
        super(name, wheels, screws, 0);
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
        return false;
    }

    @Override
    public String carriesCargo() {
        return "Helicopter is carries cargo";
    }
}
