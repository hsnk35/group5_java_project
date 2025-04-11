package ahmet_codes.week11;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {

        int[] arr = {2, 10, 9, 1, 8, 7};
        int[] sorted = sortArray(arr); // Sıralama işlemi tamamlandı and returned

        System.out.println("Sorted Array = " + Arrays.toString(sorted));
    }

    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // Bu, herhangi bir değişim olup olmadığını kontrol eder

            for (int j = 0; j < arr.length - i - 1; j++) {
                // ele alınan eleman bir sonraki elemandan büyükse, yer değişir
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Değişim olduysa true olur
                }
            }

            if (!swapped) break; // Eğer bu turda hiç değişim olmadıysa, dizi zaten sıralıdır
        }

        return arr; // Sıralanmış diziyi döndür
    }


}
