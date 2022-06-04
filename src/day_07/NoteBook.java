package day_07;

public class NoteBook {

    public static void main(String[] args) {



        for (int i = 1; i < 5; i++) {

            System.out.println("Week: " +i);  // i=1 will print week: + 1>(i=1) // then goes to inner loop


            for (int j = 1; j <8 ; j++) {   // j=1 it will print "space" Day: + 1 (j=1) until j reaches 7 but not including 8
                System.out.println("\tDay: "+j); // then out from inner loop goes to next line

            }

            System.out.println("\t\t.....    ..   ...."); //

            if(i==2||i==3){  // (i) is still is 1  so this line won't print

                System.out.println("....  .. ....");
            }

        }


    }
}
