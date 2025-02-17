package salia.week2;

public class FINRA {
    public static void main(String[] args) {


        int number = 30;

        finraNumber(number);


    }

    private static void finraNumber(int number) {
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }

        }

    }

}
