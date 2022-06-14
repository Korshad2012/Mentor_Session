package day_09;

public class TwoFighterOneWinner {

    public static void main(String[] args) {

        Fighters fighter1 = new Fighters();

        fighter1.setInfo("Tom",10,2);

        Fighters fighter2=new Fighters();

        fighter2.setInfo("Harry",5,4);


         String winner = Fighters.result(fighter1,fighter2,fighter1.name);

        System.out.println(winner);








    }





    }




