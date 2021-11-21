package main;

import warriors.*;

import java.util.LinkedList;

public class Army {
    private LinkedList<Warrior> army;

    public Army () {
        army = new LinkedList<Warrior>();
    }

    public void addUnit (Units unit) {
        switch (unit) {
            case SWORDSMAN -> {
                army.add(new Swordsman("Мечники"));
            }
            case ARCHER -> {
                army.add(new Archer("Лучники"));
            }
            case HORSEMAN -> {
                army.add(new Horseman("Конница"));
            }
            case MAGICIAN -> army.add(new Magician("Маги"));
        }
    }

}
