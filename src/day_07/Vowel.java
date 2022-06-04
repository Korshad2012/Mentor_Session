package day_07;

public class Vowel {

    public static void main(String[] args) {

        String str = "bbddeeaffgi";

        String unique = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                unique += ch; // eeai
            }
        }


        String a = unique; // eeai
        String b = "";

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (ch == a.charAt(j)) {
                    count++;
                }


            }


            if (count == 1) {
                b += ch; // ai
                System.out.println(str.indexOf(b.substring(0, 1)));
                break;
            }


        }

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (ch == a.charAt(j)) {
                    count++;
                }


            }


            if (count == 1) {
                b += ch; // empty

            }
            if (b.equals("")) {
                System.out.println(-1);
                break;
            }


        }
    }


}












