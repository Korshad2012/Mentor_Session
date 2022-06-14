package day_09;

public class Fighters {

    public String name;
    public int health;
    public int damagePerAttack;


    public void setInfo(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public static String result(Fighters fighter1, Fighters fighter2, String firstAttacker) {

        boolean turn1 = fighter1.name == firstAttacker;
        while (true) {
            if (turn1) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0)
                    return fighter1.name+ " Wins";
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0)
                    return fighter2.name + " Wins";
            }
            turn1 = !turn1;


        }


    }
}
