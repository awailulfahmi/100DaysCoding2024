
package day69;

import java.util.Scanner;

public class Day93 {
        public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("masukan angka memberntuk pola v");
        int a = ab.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2 * a - 1; j++) {
                if (j == (a - 1 - i) || j == (a-1+i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
