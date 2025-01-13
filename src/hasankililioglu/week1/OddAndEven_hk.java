package hasankililioglu.week1;

public class OddAndEven_hk {
    public static void main(String[] args) {

       int num =99;
       String result = identify(num);
       System.out.println(result);

    }

    public static String identify(int number) {
        if (number % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}
