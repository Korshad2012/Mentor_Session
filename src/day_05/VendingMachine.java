package day_05;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {
        System.out.println("Enter the cash");

        Scanner input = new Scanner(System.in);
        int priceInCents = input.nextInt();

        input.close();

        int change = 100 - priceInCents;

        int quarters = change / 25;
        int dimes = (change % 25) / 10;
        int nickles = (change % 25) % 10 / 5;
        int pennies = ((change % 25) % 10) % 5;

        if (priceInCents > 0 && priceInCents <= 100) {
            System.out.println("Your change is " + quarters + " quarters," + dimes + " dimes," + nickles + " nickles " + " and " + pennies + " pennies");
        } else {
            System.err.println("INVALID CENT AMOUNT!!!!!");
        }


    }
}
