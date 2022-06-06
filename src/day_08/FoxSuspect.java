package day_08;

import java.util.Scanner;

public class FoxSuspect {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Does fox wear black coat and carry three bags and had torch?: true/false");
        boolean answer = input.nextBoolean();

        System.out.println(checkSuspect(answer));


        input.close();


    }

    public static String checkSuspect(boolean answer) {
        if (answer) {
            return "Fox is one of the suspects!";
        } else {
            return "Fox cleared of charges";
        }
    }

}
