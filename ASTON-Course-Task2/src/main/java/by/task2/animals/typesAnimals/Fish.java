package by.task2.animals.typesAnimals;

import by.task2.animals.abstracts.Animal;
import by.task2.animals.interfaces.Water;

public class Fish extends Animal implements Water {
    public Fish() {
        super("Fish");
    }

    @Override
    public void livingInWater() {
        System.out.println(getName() + " is living in the water");
    }
}
