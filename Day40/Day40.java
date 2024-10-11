
package day40;
import java.util.Scanner;
public class Day40 {

    public static void main(String[] args) {
Scanner awal = new Scanner (System.in);
        System.out.println("nilai ujian pertama");
        int nilai = awal.nextInt();
        System.out.println("nilai ujian kedua");
        int nilai2 = awal.nextInt();
        nilai-=nilai2;
        System.out.println("selisih nilai ujian"+nilai);
    }
    
}
