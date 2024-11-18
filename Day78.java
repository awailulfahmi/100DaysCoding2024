package day69;
import java.util.Scanner;
public class Day78{
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("masukan sandi");
        String a = ab.nextLine();
        
        String b = "awal12345";
        
        if(b.equalsIgnoreCase(a)){
            System.out.println("sandi benar");
        }
        else{
            System.out.println("sandi salah");
        }
        
    }
}
