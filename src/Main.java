
//        ● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//        полям). Затем распечатать всю информацию о боссе.

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.setQuirk("Barrier");
        System.out.println(boss.getHealth() +" "+ boss.getDamage()+" "+boss.getQuirk());
    }
}