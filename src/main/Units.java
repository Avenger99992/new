package main;

public enum Units {
    SWORDSMAN (500, 25),
    ARCHER (350, 15),
    HORSEMAN (700, 40),
    MAGICIAN (900, 0);

    private int price;
    private int damage;
    Units (int price, int damage) {
        this.price = price;
        this.damage = damage;
    }

    public int getPrice () {
        return price;
    }

    public int getDamage () {
        return damage;
    }
}
