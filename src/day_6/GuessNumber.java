package day_6;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {


        System.out.println("Enter number you guessed:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();




        while (num != 45) {
            System.out.println("try again");
            num = input.nextInt();
            if (num > 45) {
                System.out.println("Too big");
            }else if (num < 45) {
                System.out.println("Too small");
            }
            num = input.nextInt();


        }
        System.out.println("Congratulations!");
        input.close();
    }

}