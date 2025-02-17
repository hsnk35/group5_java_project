package salia.week4;

public class ReverseNegativeNumber {
    public static void main(String[] args) {


        System.out.println("reverseNegativeNumber(-12345) = " + reverseNegativeNumber(-12345));


    }
    public static int reverseNegativeNumber(int number) {
        // -12345 ----> 54321-     -54321
        String str=""+number*-1;
        //parse int into string, reverse it, and parse it back into int.

        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
        //int n= Integer.valueOf(sb.toString());
        int n=Integer.parseInt(sb.toString());           // Convert the string to an integer
        n=n*(-1);
        return n;
    }

}
