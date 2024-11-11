
package day71;
import java.util.Scanner;
public class Day71 {
    public static int penjumlahan(int a, int b){
        return a + b;
    }
    
    public  static class main{
        public static void main(String[] args) {
          Scanner ab = new Scanner (System.in);
            System.out.println("masukan angka");
            int angka1 = ab.nextInt();
            System.out.println("masukan angka");
            int angka2 = ab.nextInt();
            int hasil = Day71.penjumlahan(angka1, angka2);
            System.out.println("hasil "+hasil);
        }
    }
    
}
