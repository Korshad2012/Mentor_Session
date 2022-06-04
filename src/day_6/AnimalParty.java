package day_6;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AnimalParty {

    public static void main(String[] args) {

        String name = "lion";
        String dish = "lion chops";


        String answer = (isEligible(name, dish)) ? "Yeahhhhhhhhhhhhhhh!" : "NOOOoooooooooooo!";

        System.out.println(answer);

    }

    public static boolean isEligible(String name, String dish) {

        return (name.charAt(0) == dish.charAt(0) && name.charAt(name.length() - 1) == dish.charAt(dish.length() - 1));


    }


}
