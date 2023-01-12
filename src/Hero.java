//ДЗ:
//        ● Создать класс Героя (Hero), с приватными полями здоровье, урон и
//        суперспособность. Написать 2 разных конструктора для создания объекта. В
//        одном конструкторе задаются все поля, в другом только здоровье и урон. Добавить
//        в класс Hero геттеры для всех полей.
//

public class Hero {
    private int health;
    private int damage;
    private String quirk;

    public String getQuirk() {
        return quirk;
    }



    public int getDamage() {
        return damage;
    }



    public int getHealth() {
        return health;
    }


    public Hero(int health, int damage, String quirk) {
        this.health=health;
        this.damage=damage;
        this.quirk=quirk;
    }
    public Hero(int health,int damage){
        this.health=health;
        this.damage=damage;
    }
}
