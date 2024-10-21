import java.util.Scanner;
public class latihan2 {
   public static void main(String[]arngs){
       Scanner al= new Scanner(System.in);
       System.out.println("masukan angka");
       byte a = al.nextByte();
       System.out.println("masukan angka kedua");
       byte b = al.nextByte();
       
       if(a>b){
           System.out.println("angka a lebih besar");
       }
       if(a<b){
           System.out.println("angka b lebih besar");
       }
       
}
}
