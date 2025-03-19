package ahmet_codes.week8;

public class ReversedString {

    public static void main(String[] args) {

        String str = "ABCD";

        String resultString=reverseString(str);
        System.out.println(resultString);
    }

    public static String reverseString(String word) {
        String result="";
        for (int i = word.length()-1; i >=0; i--) {
             result+=word.charAt(i);

        }return result;

    }
}
