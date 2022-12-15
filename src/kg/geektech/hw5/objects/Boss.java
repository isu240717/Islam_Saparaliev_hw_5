package kg.geektech.hw5.objects;
public class Boss {
    // Приватные поля
    private int BossHealth;
    private int BossDamage;
    private String BossProtectionType;

    public Boss() {
        this.BossHealth = 0;
        this.BossDamage = 0;
        this.BossProtectionType = "";
    }

    public int getHealth() {
        return this.BossHealth;
    }

    public void setHealth(int health) {
        this.BossHealth = health;
    }

    public int getDamage() {
        return this.BossDamage;
    }

    public void setDamage(int damage) {
        this.BossDamage = damage;
    }

    public String getProtectionType() {
        return this.BossProtectionType;
    }

    public void setProtectionType(String protectionType) {
        this.BossProtectionType = protectionType;
    }
}
