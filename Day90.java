package day90;

import java.util.Scanner;

public class Day90 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Umur");
        int a = ab.nextInt();
        if (a <= 5) {
            System.out.println("Balita");
        } else if (a <= 12) {
            System.out.println("Anak - anak");
        } else if (a <= 17) {
            System.out.println("Remaja");
        } else if (a > 17) {
            System.out.println("Dewasa");
        }

    }

}
package day90;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        int b = ab.nextInt();
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("kedua bilangan adalah genap");
        } else if (a % 2 == 1 && b % 2 == 1) {
            System.out.println("kedua bilangan adalah ganjil");
        } else {
            System.out.println("Satu bilangan genap dan satu bilangan ganji");
        }
    }
}

package day90;

public class soal3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 5; i-=5) {
            System.out.print(i+" ");
        }
    }
}

package day90;

public class soal4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i <= 30; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
}
}
package day90;

import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        if (a > 0) {
            System.out.println("positif");
        } else if (a < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}
