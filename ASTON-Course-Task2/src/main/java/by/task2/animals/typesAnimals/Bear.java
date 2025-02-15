package by.task2.animals.typesAnimals;

import by.task2.animals.abstracts.Mammal;
import by.task2.animals.interfaces.Wool;

public class Bear extends Mammal implements Wool {
    public Bear() {
        super("Bear", "Raau");
    }

    @Override
    public void infoAboutWool() {
        System.out.println("The bear has a stiff wool");
    }
}
