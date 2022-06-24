package day_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestAndLowestNumber {

    public static void main(String[] args) {
        String str ="1 2 3 4 56";

        String [] nums = str.split(" ");

        ArrayList<Integer> list = new ArrayList<>();

        for (String each : nums) {
            list.addAll(Arrays.asList(Integer.parseInt(each)));
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);



    }




}
