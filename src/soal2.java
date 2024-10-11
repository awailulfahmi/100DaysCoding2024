import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner awal = new Scanner(System.in);
        System.out.println("stok pertama pertama");
        int stok1 = awal.nextInt();
        System.out.println("stok kedua");
        int stok2 = awal.nextInt();
        stok1-=stok2;
        System.out.println("selisih stok barang adalah"+stok1);
    }
}
