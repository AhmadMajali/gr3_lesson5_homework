import java.io.StringReader;

public class Hero {
  private int health;
  private int damage;
  private String superpower;

    public Hero(int theHealth, int theDamage, String theSuperpower){
       health=theHealth;
       damage=theDamage;
       superpower=theSuperpower;
    }
    public Hero(int theHealth, int theDamage){
     health=theHealth;
     damage=theDamage;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth() {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage() { this.damage = damage;}

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower() { this.superpower = superpower;}

}

