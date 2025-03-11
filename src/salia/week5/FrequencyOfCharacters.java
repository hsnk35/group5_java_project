package salia.week5;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="AAABBBCCC";
        //expected=A3 B3 C3
        frequencyOfCharacters(str);




    }

    private static void frequencyOfCharacters(String str) {
        int[] freq= new int[str.length()];    //
        char[] str1=str.toCharArray();        //

        for (int i = 0; i <str.length() ; i++) {
            freq[i]=1;
            for (int j = i+1; j <str.length() ; j++) {
                if (str1[i]==str1[j]) {
                    freq[i]++;
                    str1[j]='0';
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (str1[i]!=' ' && str1[i]!='0'){
                System.out.print(str1[i]+ ""+ freq[i]+" ");
            }
        }

    }

}
