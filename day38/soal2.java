
package day38;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("Stok beras yang dimiliki");
        int a = ab.nextInt();
        System.out.println("beras yang di bagi setiap bulan");
        int b = ab.nextInt();
        a/=b;
        System.out.println("stok beras yang tersisa "+a);
    }
   
}
