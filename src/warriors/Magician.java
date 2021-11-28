package warriors;

import main.Units;

public class Magician extends Warrior {
    private int mana;

    public Magician() {
        super("Маги", 0, Units.MAGICIAN);
        mana = 300;
    }

    public int getMana() {
        return mana;
    }


}
