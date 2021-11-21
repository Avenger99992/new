package main;

public class Players {
    private int gold;

    Players () {
        gold=3000;
    }

    public int getGold () {
        return gold;
    }

    public int setGold (int gold) {
        return this.gold = gold;
    }

}
