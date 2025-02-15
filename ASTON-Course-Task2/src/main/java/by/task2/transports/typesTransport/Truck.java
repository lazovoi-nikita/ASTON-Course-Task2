package by.task2.transports.typesTransport;

import by.task2.transports.abstracts.Vehicles;
import by.task2.transports.interfaces.IVehicles;

public class Truck extends Vehicles implements IVehicles {
    public Truck(String name, int wheels) {
        super(name, wheels, 0, 0);
    }

    @Override
    public boolean hasWheels() {
        return true;
    }

    @Override
    public boolean hasScrew() {
        return false;
    }

    @Override
    public boolean hasWings() {
        return false;
    }

    @Override
    public String carriesCargo() {
        return "Truck is carries cargo";
    }
}
