package main;

import warriors.BattleUnit;

import java.util.Random;
import java.util.Scanner;


public class Battle {


    public static void startBattle(Army a, Army b) {
        while (a.checkArmy() && b.checkArmy()) {
            System.out.println("Ваша армия:" + a);
            System.out.println("Армия противника:" + b);
            System.out.println("Выберите Ваш отряд");
            int i, j, k, l;
            Scanner in = new Scanner(System.in);
            i = in.nextInt() - 1;
            if (a.getUnit(i).getUnitType().equals(Units.MAGICIAN)) {
                System.out.println("У Вашего мага " + a.getUnit(i).getMana() + " маны, выберите заклинание:");
                System.out.println("1. Проклятье");
                System.out.println("2. Наслать ужас");
                System.out.println("3. Восстановить здоровье");
                k = in.nextInt();
                switch (k) {
                    case 1:
                        System.out.println("Выберите отряд, на который Вы будете нападать:");
                        l = in.nextInt() - 1;
                        spellCurse(a.getUnit(i), b.getUnit(l));
                        break;
                    case 2:
                        System.out.println("Выберите отряд, на который Вы будете нападать:");
                        l = in.nextInt() - 1;
                        spellHorror(a.getUnit(i), b.getUnit(l));
                        break;
                    case 3:
                        System.out.println("Выберите отряд, которому восстановите здоровье:");
                        l = in.nextInt() - 1;
                        restoreHp(a.getUnit(i), a.getUnit(l));
                        break;
                    default:
                }
            } else {
                System.out.println("Выберите отряд, на который Вы будете нападать:");
                j = in.nextInt() - 1;
                attack(a.getUnit(i), b.getUnit(j));
            }
            b.checkUnit();
            if (!b.checkArmy()) System.out.println("Победа игрока");
            else {
                Random rand = new Random();
                int r = (int) (b.getSize() * rand.nextDouble());
                int r3 = (int) (a.getSize() * rand.nextDouble());
                int r4 = (int) (b.getSize() * rand.nextDouble());
                if (b.getUnit(r).getUnitType().equals(Units.MAGICIAN)) {
                    int r2 = (int) (3 * rand.nextDouble());
                    switch (r2) {
                        case 1:
                            spellCurse(b.getUnit(r), a.getUnit(r3));
                            System.out.println(b.getUnit(r).getName() + " нанес 30 урона заклинанием на " + a.getUnit(r3).getName());
                            break;
                        case 2:
                            spellHorror(b.getUnit(r), a.getUnit(r3));
                            System.out.println(b.getUnit(r).getName() + " применил заклинание ужас на " + a.getUnit(r3).getName());
                            break;
                        case 3:
                            restoreHp(b.getUnit(r), b.getUnit(r4));
                            System.out.println(b.getUnit(r).getName() + " восстановил 15 ХП " + b.getUnit(r4).getName());
                            break;
                    }
                } else {
                    attack(b.getUnit(r), a.getUnit(r3));
                    System.out.println(b.getUnit(r).getName() + " нанес " + b.getUnit(r).getDamage() + " урона " + a.getUnit(r3).getName());
                }
            }
            a.checkUnit();
        }
        if (b.checkArmy()) System.out.println("Победа компуктера");
    }


    public static void attack(BattleUnit a, BattleUnit b) {
        b.setHp(b.getHp() - a.getDamage());
        b.setMorale(b.getMorale() - 10);
    }

    public static void spellCurse(BattleUnit a, BattleUnit b) {
        a.setMana(a.getMana() - 40);
        b.setHp(b.getHp() - 30);
    }

    public static void spellHorror(BattleUnit a, BattleUnit b) {
        a.setMana(a.getMana() - 25);
        b.setMorale(b.getMorale() - 40);
    }

    public static void restoreHp(BattleUnit a, BattleUnit b) {
        a.setMana(a.getMana() - 30);
        b.setHp(b.getHp() + 15);
    }


}
