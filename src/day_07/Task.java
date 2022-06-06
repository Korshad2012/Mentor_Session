package day_07;

public class Task {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        /*
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1 */
        for (int i = 5; i > 0; i--) {

            System.out.print(1 + " ");

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
        System.out.println("=====================================");

        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */

        System.out.println("=====================================");





    }
}
