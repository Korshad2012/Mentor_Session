package day_07;

public class Self_Practice {

    public static void main(String[] args) {

        String str = "Guess Me";

        for (int i = 0; i <str.length() ; i++) {
          str = str.replace(str.charAt(i), 'R');

            System.out.print(str);


        }

    }
}