package by.task2.animals.abstracts;

import by.task2.animals.interfaces.Spine;

public abstract class Mammal extends Animal implements Spine {
    private final String voice;

    public Mammal(String name, String voice) {
        super(name);
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    @Override
    public void move() {
        System.out.println(getName() + " moves and says " + voice);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + getName() + '\'' +
                ", voice='" + getVoice() + '\'' +
                '}';
    }
}
