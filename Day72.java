
package day69;
import java.util.Scanner;
public class Day72 {
   // Menghitung faktorial angka
    public static int jumlah(int n) {

        if (n == 1) {
            return 1;
        }
        // Panggilan rekursif
        return n + jumlah(n - 1);
    }

    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        int a = ab.nextInt();
        int hasil = jumlah(a);
        System.out.println("Jumlah dari 1 hingga "+ a + " adalah " + hasil);
    }
}
