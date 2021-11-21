package main;

public class Main {
    public static void main(String[] args) {

        Players player1 = new Players();
        Players player2 = new Players();
        Army playerArmy = Menu.manualCreation(player1);
        Army enemyArmy = Menu.randomCreation(player2);
    }


}
