package day69;

import java.util.*;

public class Day95 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
