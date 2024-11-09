
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Input");
        int a = ab.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (j == i) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }

            }
            System.out.println();
        }
    }
}
