package day_07;

public class VowelSimpleSolution {

    public static void main(String[] args) {

        String str = "abbbeeeoouu";
       // int result=-1;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                for (int j = 0; j < str.length(); j++) {
                    if (ch == str.charAt(j)) {
                        count++;
                    }
                }


            }
            if (count == 1) {
                System.out.println(i);
                return;

            }
        }

        System.out.println(-1);



    }
}
