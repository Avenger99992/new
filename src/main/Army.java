package main;

import warriors.*;

import java.util.LinkedList;


public class Army {
    private LinkedList<BattleUnit> army;

    public Army() {
        army = new LinkedList<>();
    }

    public void addUnit(Units unit) {
        switch (unit) {
            case SWORDSMAN -> army.add(new BattleUnit(new Swordsman()));
            case ARCHER -> army.add(new BattleUnit(new Archer()));
            case HORSEMAN -> army.add(new BattleUnit(new Horseman()));
            case MAGICIAN -> army.add(new BattleUnit(new Magician()));
        }
    }

    public int getSize() {
        return army.size();
    }

    public BattleUnit getUnit(int i) {
        return army.get(i);
    }

    public boolean checkArmy() {
        return army != null;
    }

    public void checkUnit() {
        for (int i = 0; i < army.size(); i++) {
            if (army.get(i).getHp() <= 0 || army.get(i).getMorale() <= 0) remove(i);
            else if (army.get(i).getUnitType().equals(Units.MAGICIAN) && army.get(i).getMana() < 25) remove(i);
        }
    }

    public void remove(int i) {
        army.remove(i);
    }

    @Override
    public String toString() {
        for (int i = 0; i < army.size(); i++) {
            System.out.println(i + 1 + " " + army.get(i).toString());
        }
        return "";
    }

}
