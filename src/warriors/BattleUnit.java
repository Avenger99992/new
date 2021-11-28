package warriors;

import main.Units;

public class BattleUnit {
    private int hp;
    private int damage;
    private int morale;
    private int mana;
    private String name;
    Units unit;

    public BattleUnit (Warrior a) {
        name = a.getName();
        hp = a.getHp();
        morale = a.getMorale();
        damage = a.getDamage();
        unit = a.getUnitType();
    }

    public BattleUnit (Magician a) {
        name = a.getName();
        hp = a.getHp();
        morale = a.getMorale();
        mana = a.getMana();
        unit = a.getUnitType();
    }

    public int getHp () {
        return hp;
    }
    public int getMana () {
        return mana;
    }

    public int getDamage() {
        return damage;
    }

    public int getMorale () {
        return morale;
    }

    public Units getUnitType () {
        return unit;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMorale (int morale) {
        this.morale=morale;
    }
    public String getName () {
        return name;
    }

    public void setMana (int mana) {
        this.mana=mana;
    }

    @Override
    public String toString() {
        return name + " hp=" + hp + ", morale=" + morale;
    }


}
