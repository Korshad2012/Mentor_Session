package day_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayAndArrayList {

    public static void main(String[] args) {

        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(-33);

        Arrays.sort(arr); // call sort method  from Arrays clas

        Collections.sort(numbers); // call sort method from collections class

        System.out.println(Arrays.toString(arr));
        System.out.println(numbers);





    }
}
