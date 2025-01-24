package salia.week1;

public class OddAndEvenSU {
    public static void main(String[] args) {

        System.out.println("oddOrEven(10) = " + oddOrEven(10));
        System.out.println("oddOrEven(15) = " + oddOrEven(15));


    }
    public static String oddOrEven(int number) {
        if (number%2==0){
            return "The number is even";
        }else {
            return "The number is odd";
        }
    }
}
