package salia.week1;

public class Revearsing {
    public static void main(String[] args) {

        //String word= "CYDEO";     // OEDYC
        System.out.println("reverseWord(\"Cydeo\") = " + reverseWord("Cydeo"));


    }
public static String reverseWord(String str) {
    String reverse="";
    for (int i = str.length()-1; i>=0 ; i--) {
       char c= str.charAt(i);
       reverse=reverse+c;
    }return reverse;
}
}

