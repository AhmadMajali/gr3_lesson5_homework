import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Boss one = new Boss();
      one.healthBoss = 100;
      one.damageBoss = 50;
      one.typeOfDefence = "Magical defence";
        System.out.println("Boss's health: " + one.healthBoss + "; Boss's damage: " + one.damageBoss + "; Boss's type of defence: " + one.typeOfDefence);
    }
    public static void createHeroes(){
        Hero alex = new Hero(200, 190, "Can breath under the water");
        Hero kutuz = new Hero(100, 20, "Can jump very high");
        Hero gudai = new Hero(111,0);

    }

    }
