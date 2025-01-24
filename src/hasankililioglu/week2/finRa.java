package hasankililioglu.week2;

public class finRa {
    public static void main(String[] args) {

        for (int i = 1; i < 30; i++) {

            if (i % 3 == 0) {
                System.out.println("Fin");
            }else if (i % 5 == 0) {
                System.out.println("RA");
            }else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FinRA");
            }else {
                System.out.println(i);
            }

        }

    }
}


