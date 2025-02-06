package salia.week4;

public class ReverseNegativeNumber {
    public static void main(String[] args) {


        System.out.println("reverseNegativeNumber(-12345) = " + reverseNegativeNumber(-12345));


    }
    public static int reverseNegativeNumber(int number) {
        String str=""+number*-1;
        StringBuilder sb=new StringBuilder(str);
        sb=sb.reverse();
       int n= Integer.valueOf(sb.toString());
        //int n=Integer.parseInt(sb.toString());
        n=n*(-1);
        return n;
    }

}
