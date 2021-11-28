package warriors;

import main.Units;

public abstract class Warrior {
    private int hp;
    private int morale;
    private String name;
    private int damage;
    Units unit;

    public Warrior(String name, int damage, Units unit) {
        this.name = name;
        hp = 100;
        morale = 100;
        this.damage = damage;
        this.unit = unit;
    }

    public Units getUnitType() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getMorale() {
        return morale;
    }


}
