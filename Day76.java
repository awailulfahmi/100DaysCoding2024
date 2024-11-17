package day69;
import java.util.Scanner;
public class Day76 {
    public static void main(String[] args) {
        Scanner ab =  new Scanner (System.in);
        System.out.println("masukan sandi anda");
            String  sandi = ab.nextLine();
        
            if (sandi.toUpperCase().equals("AWAL12345")){
                    System.out.println("sandi yang anda benar");
                 
            }else{
                            System.out.println("sandi anda salah coba lagi");
                            }
        
    }


}
