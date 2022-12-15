package kg.geaktech.hw5.general;

import kg.geektech.hw5.objects.Boss;
import kg.geektech.hw5.objects.Hero;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtectionType("Armor");

        System.out.println("Boss information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Protection type: " + boss.getProtectionType());

        Hero[] heroes = createHeroes();

        System.out.println("Heroes information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Super ability: " + hero.getSuperPower());
        }
    }
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Hero(100, 10, "Super strength");
        heroes[1] = new Hero(200, 20);
        heroes[2] = new Hero(50, 5, "Super speed");

        return heroes;
    }
}