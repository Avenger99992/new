package main;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    static Army army = new Army();
    static Army enemyArmy = new Army();

    public static Army manualCreation(Players player1) {
        int count = 0;

        while (count < 5 && player1.getGold() >= Units.ARCHER.getPrice()) {
            int i;
            Scanner in = new Scanner(System.in);
            System.out.println("Ваше золото:" + player1.getGold());
            System.out.println("Набор армии ");
            System.out.println("1.Пехота " + Units.SWORDSMAN.getPrice());
            System.out.println("2.Лучники " + Units.ARCHER.getPrice());
            System.out.println("3.Конница " + Units.HORSEMAN.getPrice());
            System.out.println("4.Маги " + Units.MAGICIAN.getPrice());
            i = in.nextInt();
            switch (i) {
                case 1:
                    if (player1.getGold() >= Units.SWORDSMAN.getPrice()) {
                        army.addUnit(Units.SWORDSMAN);
                        count++;
                        player1.setGold(player1.getGold() - Units.SWORDSMAN.getPrice());
                    } else System.out.println("Недостаточно золота, повторите выбор");
                    break;
                case 2:
                    if (player1.getGold() >= Units.ARCHER.getPrice()) {
                        army.addUnit(Units.ARCHER);
                        count++;
                        player1.setGold(player1.getGold() - Units.ARCHER.getPrice());
                    } else System.out.println("Недостаточно золота, повторите выбор");
                    break;
                case 3:
                    if (player1.getGold() >= Units.HORSEMAN.getPrice()) {
                        army.addUnit(Units.HORSEMAN);
                        count++;
                        player1.setGold(player1.getGold() - Units.HORSEMAN.getPrice());
                    } else System.out.println("Недостаточно золота, повторите выбор");
                    break;
                case 4:
                    if (player1.getGold() >= Units.MAGICIAN.getPrice()) {
                        army.addUnit(Units.MAGICIAN);
                        count++;
                        player1.setGold(player1.getGold() - Units.MAGICIAN.getPrice());
                    } else System.out.println("Недостаточно золота, повторите выбор");
                    break;
                default:
                    System.out.println("Повторите выбор");
                    break;
            }
        }
        System.out.println("Набор окончен");
        return army;
    }

    public static Army randomCreation(Players player2) {
        Random rand = new Random();
        int count2 = 0;
        while (count2 < 5 && player2.getGold() >= Units.ARCHER.getPrice()) {
            int r = (int) (5 * rand.nextDouble());
            switch (r) {
                case 1:
                    if (player2.getGold() >= Units.SWORDSMAN.getPrice()) {
                        enemyArmy.addUnit(Units.SWORDSMAN);
                        count2++;
                        player2.setGold(player2.getGold() - Units.SWORDSMAN.getPrice());
                    }
                    break;
                case 2:
                    if (player2.getGold() >= Units.ARCHER.getPrice()) {
                        enemyArmy.addUnit(Units.ARCHER);
                        count2++;
                        player2.setGold(player2.getGold() - Units.ARCHER.getPrice());
                    }
                    break;
                case 3:
                    if (player2.getGold() >= Units.HORSEMAN.getPrice()) {
                        enemyArmy.addUnit(Units.HORSEMAN);
                        count2++;
                        player2.setGold(player2.getGold() - Units.HORSEMAN.getPrice());
                    }
                    break;
                case 4:
                    if (player2.getGold() >= Units.MAGICIAN.getPrice()) {
                        enemyArmy.addUnit(Units.MAGICIAN);
                        count2++;
                        player2.setGold(player2.getGold() - Units.MAGICIAN.getPrice());
                    }
                    break;
            }
        }
        return enemyArmy;
    }

}
