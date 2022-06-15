package day_09;

public class TwoFighterOneWinner {

    public static void main(String[] args) {

        Fighters fighter1 = new Fighters();

        fighter1.setInfo("Tom",10,2);

        Fighters fighter2=new Fighters();

        fighter2.setInfo("Harry",5,4);


         String winner = result(fighter1,fighter2,fighter1.name);

        System.out.println(winner);

        Fighters fighters3 = new Fighters();
        fighters3.setInfo("Jerry",30,3);

        Fighters fighters4 = new Fighters();
        fighters3.setInfo("Harold",20,5);

        String winner2 = result(fighters3,fighters4, fighters3.name);

        System.out.println(winner2);








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




