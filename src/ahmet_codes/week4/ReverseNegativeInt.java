package ahmet_codes.week4;

public class ReverseNegativeInt {
    public static void main(String[] args) {

        int a = -2115;

        int resultNumber = ReverseNegativeNumbers(a);

        System.out.println(resultNumber);

    }

    private static int ReverseNegativeNumbers(int number) {

        int result = 0;
        while (number != 0) {
            int remainder = number % 10;
            result = result * 10 + remainder;
            number = number / 10;

        }
        return result;
    }
}

