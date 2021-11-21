package warriors;

import main.Units;

public class Magician extends Warrior{
    private int mana;
    public Magician (String name) {
        super(name);
        mana = 100;
    }

    public int getMana () {
        return mana;
    }

    public int setMana (int mana) {
        return this.mana-mana;
    }
}
