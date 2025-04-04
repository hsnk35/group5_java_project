package ahmet_codes.week10;

import java.util.Arrays;

public class FindMinimum {


    /*
    Find Minimum
    Write a method that can find the minimum number from an int Array
     */

    public static void main(String[] args) {
        int[] numbers = {6, 8, 2, 7, -9, 2, 23,1};

        int result = findMinNumber(numbers);
        System.out.println(result);
    }

    public static int findMinNumber(int[] numbers) {

        System.out.println("given array :"+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("sorted array :"+Arrays.toString(numbers));

        return numbers[0];
    }

}