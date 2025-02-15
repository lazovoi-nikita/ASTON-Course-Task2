package by.task2.transports.typesTransport;

import by.task2.transports.abstracts.Vehicles;

public class Taxi extends Vehicles {
    public Taxi(String name, int wheels) {
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
}
