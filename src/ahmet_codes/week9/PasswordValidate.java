package ahmet_codes.week9;

public class PasswordValidate {

    //I have some requirements for password:
    // Password: must be at least have 6 characters and should not contain space
    //           should at least contain one uppercase letter
    //                                   one lowercase letter
    //                                   one special character
    //                                   a digit
    // if all requirements above are met, the method returns true, otherwise returns false

    public static void main(String[] args) {

        String password = "Password.1";
        System.out.println(isValidatePassword(password));

    }

    public static boolean isValidatePassword(String password) {

        if (password == null || password.length() < 6 || password.isBlank()) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")
                || !password.matches(".*[a-z].*")
                || !password.matches(".*[1-2].*")
                || !password.matches(".*[\\W].*")) {  ///.* herhangibir karekterin tekrar edebilme durumu
            return false;
        }

        return true;

    }
}
