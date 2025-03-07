package ahmet_codes.week5;

public class FrequencyCharacters {
    public static void main(String[] args) {


        String str = "AAABBCDD";  //a String named str is defined
        //expected=A3B2C1D2

        frequencyCharacters(str); //call a method for this solve way

    }

    private static void frequencyCharacters(String str) {

        int[] frq = new int[str.length()];
        char[] string = str.toCharArray();  //created str string is converted to a char array.

        for (int i = 0; i < string.length; i++) {  //I have started a nested for loop
            frq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j]) {
                    frq[i]++;
                    string[j] = '0';
                }
            }
        }

        for (int i = 0; i < frq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                System.out.print(string[i] + "" + frq[i]);
            }

        }

    }
}
