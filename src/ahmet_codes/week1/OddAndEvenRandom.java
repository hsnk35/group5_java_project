package ahmet_codes.week1;

import java.util.Random;

public class OddAndEvenRandom {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Your random number is : "+number);

        if (number==0) {
            System.out.println("Number is Zero");
        }
        else if (number%2==0) {
            System.out.println("Number is Even");
        }else
        {
            System.out.println("Number is Odd");
        }
    }
}
