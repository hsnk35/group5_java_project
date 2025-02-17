package salia.week3;

public class SwapTwoNumbersWithoutThirdOne {
    public static void main(String[] args) {

        //swap two numbers using arithmetic operator
        swapTwoNumbersWithoutThirdOne(2,3);
        swapTwoNumbersWithoutThirdOne(10,15);



    }

    public static void swapTwoNumbersWithoutThirdOne(int a, int b){

        System.out.println("Before swapping:  a = " + a+ " b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:   a = " + a+ " b = " + b);
    }
}
