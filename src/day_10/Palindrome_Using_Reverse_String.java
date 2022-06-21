package day_10;

public class Palindrome_Using_Reverse_String {

    public static void main(String[] args) {

       isPalindrome("hello");

    }

    public static boolean isPalindrome(String str){
        str = str.toLowerCase().trim();
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }

        if(str.equals(result)){
            return true;
        }else {
           return false;
        }

    }

}
