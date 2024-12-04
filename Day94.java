package day69;

import java.util.*;

public class Day94 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
