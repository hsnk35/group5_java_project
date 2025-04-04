package salia.week10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMinNumberFromAnArray {
    public static void main(String[] args) {

        int[] array = {-8, 20, 5, -3, 45};
        System.out.println("findMinNumberFromAnArray(array) = " + findMinNumberFromAnArray(array));


    }

    private static int findMinNumberFromAnArray(int[] array) {

        int min = array[0];

        for (int each : array) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

}
