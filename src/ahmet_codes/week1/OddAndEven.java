package ahmet_codes.week1;

public class OddAndEven {
    public static void main(String[] args) {

        int num = 81;

        String result = returnOddOrEven(num);
        System.out.println(result);

    }

    public static String returnOddOrEven(int number) {

        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
