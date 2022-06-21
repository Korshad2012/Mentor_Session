package day_10;

import java.util.Arrays;

public class Palindrome_Using_To_CharArray {

    public static void main(String[] args) {

        isPalindrome("an na");


    }

    public static void isPalindrome(String str) {
        str = str.toLowerCase().trim();

        // String [] array = str.split("");
        char[] array = str.toCharArray();
        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }

        boolean isPalindrome = Arrays.equals(array, reverse);

        System.out.println(isPalindrome);


    }
}
