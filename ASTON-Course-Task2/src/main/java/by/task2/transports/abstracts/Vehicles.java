package by.task2.transports.abstracts;

public abstract class Vehicles {
    private final String name;
    private final int wheels;
    private final int screws;
    private final int wings;

    public Vehicles(String name, int wheels, int screws, int wings) {
        this.name = name;
        this.wheels = wheels;
        this.screws = screws;
        this.wings = wings;
    }

    public String getName() {
        return name;
    }
    public int getWheels() {
        return wheels;
    }
    public int getScrews() {
        return screws;
    }
    public int getWings() {
        return wings;
    }

    public abstract boolean hasWheels();
    public abstract boolean hasScrew();
    public abstract boolean hasWings();

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getClass().getSimpleName()).append("{name=").append(getName());

        if (hasWheels()) {
            result.append(", wheels=").append(getWheels());
        }
        if (hasScrew()) {
            result.append(", screws=").append(getScrews());
        }
        if (hasWings()) {
            result.append(", wings=").append(getWings());
        }
        result.append("}");

        return result.toString();
    }
}
