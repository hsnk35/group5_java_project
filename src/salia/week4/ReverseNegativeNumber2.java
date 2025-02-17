package salia.week4;

public class ReverseNegativeNumber2 {
    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber(-213) = " + reverseNegativeNumber(-213));


    }
    public static int reverseNegativeNumber(int number) {
        String str=new StringBuilder(number+"").reverse().toString();
        // -312   ---> 213-
        if (number<0){
           str= "-"+ str.substring(0, str.length()-1);     //  -213


        }
        return Integer.parseInt(str);




    }



}
