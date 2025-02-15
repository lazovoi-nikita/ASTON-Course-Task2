package by.task2;

import by.task2.transports.abstracts.Vehicles;
import by.task2.transports.typesTransport.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /// Transports
        List<Vehicles> transports = List.of(new Airplane("Cessna 172", 3, 1),
                new Helicopter("Mi-8", 8, 2),
                new Speedboat("Chaparral 21 H2O Sport", 1),
                new Tanker("Knock Nevis", 1),
                new Truck("Freightliner Cascadia", 28),
                new Taxi("Volkswagen Polo", 4));

        for (Vehicles vehicle : transports) {
            System.out.println(vehicle);
        }
    }
}