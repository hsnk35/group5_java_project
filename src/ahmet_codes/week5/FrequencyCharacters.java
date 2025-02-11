package ahmet_codes.week5;

public class FrequencyCharacters {
    public static void main(String[] args) {


        String str = "AAABBCDD";
        //expected=A3B2C1D2

        frequencyCharacters(str);

    }

    private static void frequencyCharacters(String str) {

        int i, j;
        int[] frq = new int[str.length()];
        String resultStr = "";

        char[] string = str.toCharArray();

        for (i = 0; i < string.length; i++) {
            frq[i] = 1;
            for (j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    frq[i]++;
                    string[j] = '0';
                }
            }
        }

        for (i = 0; i < frq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.print(string[i] + "" + frq[i]);
            }

        }

    }
}
