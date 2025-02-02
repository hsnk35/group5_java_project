package selcan.week4;

public class ReverseNegativeNumber {
    public static void main(String[] args) {

        int num = 123456;
        int resultNumber = reverse(num);
        System.out.println(resultNumber); // Çıktı
    }

    private static int reverse(int number) {
        int result = 0;

        // Sayı negatif mi kontrol et
        if (number < 0) {
            number = -number; // Negatifse pozitife çevir
        }

        while (number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }

        // Başta negatifse sonucu da negatif yap
        if (result != 0) {
            return -result;
        }

        return result;
    }
}









