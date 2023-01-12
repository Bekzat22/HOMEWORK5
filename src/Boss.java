
//        ● Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
//        Добавить в класс геттеры и сеттеры для всех полей.


public class Boss {
    private int health;
    private int damage;
    private String quirk;

    public String getQuirk() {
        return quirk;
    }

    public void setQuirk(String quirk) {
        this.quirk = quirk;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
