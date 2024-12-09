package day69;

import java.util.Scanner;

public class Day99 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int a = ab.nextInt();
        System.out.print("pilih operator(+, -, *, /): ");
        char operator = ab.next().charAt(0);
        int b = ab.nextInt();
        int hasil = 0;

        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                    hasil = a / b;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        System.out.println("Hasil: " + hasil);

    }
}
