package by.task2.animals.typesAnimals;

import by.task2.animals.abstracts.Mammal;
import by.task2.animals.interfaces.Wool;

public class Cat extends Mammal implements Wool {
    public Cat() {
        super("Cat", "Meow");
    }

    @Override
    public void infoAboutWool() {
        System.out.println("Cats have very soft wool");
    }
}
