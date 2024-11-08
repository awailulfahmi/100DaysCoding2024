import java.util.Scanner;
public class Day68 {

    // Method non-void dengan tipe String
    public String cekbilangan(int a ) {
        if (a % 2 == 0) {
            return "tidak jodoh";
        } else {
            return "berjodoh";
        }
    }

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("masukan nama pasangan anda");
        String nama = ab.nextLine();
        System.out.println("masukan tanggal lahir pasangan anda");
        int angka = ab.nextInt();
        Day68 awal= new Day68();
        
        String b = awal.cekbilangan(angka);

        System.out.println(b);
    }
}


