package day69;

public class Day87 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            System.out.println("angka sebelum di rubah " + i + ":" + a[i]);
        }
        System.out.println("---------------------------");
        a[2] = 22;
        a[3] = 33;
        for (int i = 0; i < a.length; i++) {
            System.out.println("angka setelah di rubah " + i + ":" + a[i]);

        }
    }
}
