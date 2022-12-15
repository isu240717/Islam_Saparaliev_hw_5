package kg.geektech.hw5.objects;

public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero() {
        this.health = getHealth();
        this.damage = getDamage();
        this.superPower = getSuperPower();
    }

    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return this.health;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getSuperPower() {
        return this.superPower;
    }
}
