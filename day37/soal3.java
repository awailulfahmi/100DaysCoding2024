package day37;

import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("barang yang dimiliki di gudang");
        int barang = ab.nextInt();
        System.out.println("barang yang di jual setiap minggu");
        int jual = ab.nextInt();
        barang -= jual;
        System.out.println("sisa barang di guadang setelah satu minggu penjualan "+barang);
        
        
    }
}
