
import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        System.out.print("Masukkan tinggi diamond : ");
        int a = ab.nextInt();
        int b = (a / 2) + 1;

        for (int i = 1; i <= b; i++) {

            for (int j = 1; j <= b - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bagian bawah (segitiga sama kaki terbalik)
        for (int i = b - 1; i >= 1; i--) {
            for (int j = 1; j <= b - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
