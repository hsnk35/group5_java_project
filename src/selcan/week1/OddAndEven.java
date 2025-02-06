package selcan.week1;

public class OddAndEven {

    public static void main(String[] args) {

        identify(20);

    }

    public static void identify(int number) {
        if (number % 2 == 0) {
            System.out.println("This is number even");
        } else {
            System.out.println("This is number odd");

        }
    }
}