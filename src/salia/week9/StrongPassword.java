package salia.week9;

public class StrongPassword {
    public static void main(String[] args) {

        String password="Interview123!";
        System.out.println("Actual password = " + isStrongPassword(password));

    }


    private static String isStrongPassword(String password) {
        if (password.contains(" ")){
            return "Invalid password: contains spaces";
        }

        boolean hasAtLeast6char=password.length()>=6;
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasSpecialChar=false;
        boolean hasDigit=false;

        for (int i = 0; i < password.length(); i++) {
            char eachChar = password.charAt(i);
            if (Character.isUpperCase(eachChar)){
                hasUpperCase=true;
            } else if (Character.isLowerCase(eachChar)) {
                hasLowerCase=true;
            } else if (Character.isDigit(eachChar)) {
                hasDigit=true;
            }else {
                hasSpecialChar=true;
            }
        }

        boolean isStrongPassword=hasAtLeast6char && hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;

        if (isStrongPassword){
            return "Strong Password";
        }else {
            return "Not Strong Password";
        }
    }



}
