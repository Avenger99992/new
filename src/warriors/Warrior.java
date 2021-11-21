package warriors;

import main.Units;

public abstract class Warrior {
    private int hp;
    private int morale;
    private String name;

    public Warrior (String name) {
        this.name = name;
        hp = 100;
        morale = 100;
    }

    public int getHp () {
        return hp;
    }

    public int getMorale () {
        return morale;
    }

    @Override
    public String toString() {
        return name + "hp=" + hp + ", morale=" + morale;
    }
}
