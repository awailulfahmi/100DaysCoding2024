
package day37;

import java.util.Scanner;

public class soal2 {
       public static void main(String[] args) {
        Scanner bc = new Scanner (System.in);
        System.out.println("jumlah pohon yang di tanam");
        int a = bc.nextInt();
        System.out.println("jumlah pohon yang di tambahkan setelah satu bulan");
        int b = bc.nextInt();
        a += b;
        System.out.println("total pohon  dikebun "+a); 
}
}
