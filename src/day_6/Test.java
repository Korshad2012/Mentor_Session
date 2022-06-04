package day_6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

       String word= new Scanner(System.in).next();

       char f = word.charAt(0);
       char l = word.charAt(word.length()-1);

       String first = word.substring(0,1);
       String last = word.substring(word.length()-1);

        System.out.println("first letter: " +first);
        System.out.println("last letter: "+last);

    }
}
