
//        ● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения
//        полям). Затем распечатать всю информацию о боссе.
//ДЗ на сообразительность:
//        ● Добавить метод в классе Main который называется createHeroes, в теле метода
//        необходимо создать 3х героев с помощью класса Hero, используя при этом разные
//        варианты конструкторов (либо первый либо второй). Затем поместить созданные
//        экземпляры героев в массив и вернуть его с помощью команды return, как
//        возвращаемый результат метода createHeroes.
//        ● Затем вызвать этот метод в методе main и распечатать информацию о всех героях
//        массива через цикл.

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.setQuirk("Barrier");
        System.out.println(boss.getHealth() +" "+ boss.getDamage()+" "+boss.getQuirk());

        for (Hero heroes: createHeroes()) {
            if(heroes.getQuirk()==null){
                System.out.println(heroes.getHealth()+ " "+heroes.getDamage());
            }else {
                System.out.println(heroes.getHealth()+" "+heroes.getDamage()+" "+heroes.getQuirk());
            }

        }


//        for (int i = 0; i <createHeroes().length; i++) {
//            System.out.println(String.valueOf(createHeroes()));
//               break;
//        }



        }

    public static Hero[] createHeroes(){

        Hero hero1=new Hero(200,15,"self-defence");
        Hero hero2 =new Hero(200,20);
        Hero hero3=new Hero(300,30,"enhancer");

//        System.out.println(hero1.getHealth()+ "-" +hero1.getDamage()+"-"+hero1.getQuirk());
//        System.out.println(hero2.getHealth()+ "-" +hero2.getDamage());
//        System.out.println(hero3.getHealth()+ "-" +hero3.getDamage()+"-"+hero3.getQuirk());
        return new Hero[]{hero1,hero2,hero3} ;


    }



}
