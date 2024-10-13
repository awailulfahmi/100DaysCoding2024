package tes;
import java.util.Scanner;
import java.math.BigInteger;


public class Tes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka");
        BigInteger a = input.nextBigInteger();
        System.out.println("masukaan angka kedua");
        BigInteger b = input.nextBigInteger();
        
        BigInteger jumlah = a.add(b);
        BigInteger pengurang  = a.subtract(b);
        BigInteger perkalian  = a.multiply(b);
        BigInteger pembagi  = a.divide(b);
        BigInteger sisabagi  = a.remainder(b);
        
        
        System.out.println("hasil penjumlahan"+jumlah);
        System.out.println("hasil pengurangan"+pengurang);
        System.out.println("hasil perkalian"+perkalian);
        System.out.println("hasil sisa bagi"+pembagi);
        System.out.println("hasil sisa bagi"+pembagi);
        
        

        
    
                }
}
