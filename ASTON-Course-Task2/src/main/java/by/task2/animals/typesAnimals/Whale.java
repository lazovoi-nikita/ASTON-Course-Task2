package by.task2.animals.typesAnimals;

import by.task2.animals.abstracts.Mammal;
import by.task2.animals.interfaces.Water;

public class Whale extends Mammal implements Water {
    public Whale() {
        super("Whale", "Waaua");
    }

    @Override
    public void livingInWater() {
        System.out.println(getName() + " is living in the water");
    }
}
