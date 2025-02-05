package selcan.week3;

public class Swap_Numbers {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("Değiştirmeden önce   : num1 = " + num1 + ",  num2 = " + num2);

        // Değişim
        num1 = num1 + num2; // a artık 15
        num2 = num1 - num2; // b artık 5
        num1 = num1 - num2; // a artık 10

        System.out.println("Değiştirdikten sonra : num1 = " + num1 + ", num2 = " + num2);
    }
}

