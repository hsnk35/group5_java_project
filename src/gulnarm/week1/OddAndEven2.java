package gulnarm.week1;

public class OddAndEven2 {
    public static void main(String[] args) {


        int num=50;

        String result=identify(num);
        System.out.println(result);

    }

    public static String identify(int number){

        if (number%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
}









