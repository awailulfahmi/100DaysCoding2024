
package day39;
import java.util.Scanner;
public class Day39 {

    public static void main(String[] args) {
Scanner awal = new Scanner(System.in);
        System.out.println("apel yang akan di bagi ke monyet");
        int a = awal.nextInt();
        System.out.println("jumlah monyet yang akan di bagikan");
        int b = awal.nextInt();
        a%=b;
        System.out.println("apel yang tersisa setelah di bagi kemonyet"+a);
    }
    
}
