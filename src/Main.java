public class Main {

    private static Boss boss;
    public static void main(String[] args) {
        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println("Heroes :" + createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroHealth() + " "
                    +  createHeroes()[i].getHeroesAttackType());

        }

        System.out.println("Boss");
        boss = new Boss(400, 30, "Magical damage");
        System.out.println("Health :" + boss.getBossHealth() + " Damage :" + boss.getBossDamage()
                + " Defense type :" + boss.getBossDefenseType());
    }

    public static Hero[] createHeroes(){
        Hero kutuz = new Hero(200,25,"magic shoot");
        Hero karat = new Hero(250,30,"fireball attack");
        Hero sensei = new Hero(250,20,"ghost attack");
        Hero[] array = {kutuz,karat,sensei};
        return array;
    }
}