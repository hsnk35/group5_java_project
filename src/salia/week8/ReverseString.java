package salia.week8;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("reverseString(\"ABCD\") = " + reverseString("ABCD"));

    }



    public static String reverseString(String word) {

        StringBuilder sb=new StringBuilder(word);
        sb=sb.reverse();
        String reverse= sb.toString();
        return reverse;
    }

    public static String reverseWord(String str) {
        String reverse="";
        for (int i = str.length()-1; i>=0 ; i--) {
            char c= str.charAt(i);
            reverse=reverse+c;
        }return reverse;
    }
}
