import java.util.Scanner;

public class Day77 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        String a = ab.nextLine();
        int b = ab.nextInt();

        if (a.equals("ganjil")) {
            for (int m = 1; m <= b; m++) {
                if (m % 2 == 1) {
                    System.out.println(m);
                }
            }
        }
        else if (a.equals("genap")){
            for (int n = 1; n <= b; n++) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }

            }
        }

    }

}
