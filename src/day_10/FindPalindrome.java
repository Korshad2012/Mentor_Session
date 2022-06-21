package day_10;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPalindrome {

    public static void main(String[] args) {

        String [] arr = {"def","ab",};

        ArrayList<String> palindromes = findPalindrome(arr);

        System.out.println(palindromes);



    }

    public static ArrayList<String> findPalindrome(String[] arr){
        ArrayList<String> result = new ArrayList<>();
        for (String each : arr) {
            if(Palindrome_Using_Reverse_String.isPalindrome(each)){
                result.add(each);
            }
        }
        return result;


    }



}
