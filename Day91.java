package day69;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        while (true) {
            int a = ab.nextInt();
            if (a % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and ai");
                break;
            }

        }
    }
}
