package by.task2.transports.typesTransport;

import by.task2.transports.abstracts.Vehicles;
import by.task2.transports.interfaces.IVehicles;

public class Tanker extends Vehicles implements IVehicles {
    public Tanker(String name, int screws) {
        super(name, 0, screws, 0);
    }

    @Override
    public boolean hasWheels() {
        return false;
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
        return "Tanker is carries cargo";
    }
}
