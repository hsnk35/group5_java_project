package salia.week7;

public class UniqueCharacter {

    public static void main(String[] args) {


        String str="AAABBBCCCDEF";
        System.out.println("uniqueCharacter(str) = " + uniqueCharacter(str));
    }

    private static String uniqueCharacter(String str) {
        String unique="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)) {
                unique+=ch;
            }
        }
        return unique;
    }
}
