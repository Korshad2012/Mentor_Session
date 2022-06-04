package day_05;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        System.out.println("Enter year you want to check:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        input.close();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.err.println("Not Leap Year");
        }

    }

}
