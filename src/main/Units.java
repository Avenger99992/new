package main;

public enum Units {
    SWORDSMAN (500),
    ARCHER (350),
    HORSEMAN (700),
    MAGICIAN (900);

    private int price;
    Units (int price) {
        this.price = price;
    }

    public int getPrice () {
        return price;
    }

}
