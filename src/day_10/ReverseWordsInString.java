package day_10;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "hello world";

        // first step use the split method to convert string to Array



        String [] array = str.split(" ");
       String result="";

        for (int i = array.length - 1; i >= 0; i--) {
            result+=array[i]+" ";
        }
        System.out.println(result);

    }
}
