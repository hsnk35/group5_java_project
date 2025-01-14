package ahmet_codes.week1;

import java.util.Scanner;

public class OddAndEven2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter an integer number : ");

        int number=scanner.nextInt();

        if (number==0) {
            System.out.println("Number is Zero");
        }
        else if (number%2==0) {
            System.out.println(number+" number is Even");
        }else
        {
            System.out.println(number+" number is Odd");
        }


    }
}
