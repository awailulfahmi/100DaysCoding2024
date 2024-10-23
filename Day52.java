import java.util.Scanner;
public class Day52 {
  public static void main (String[]arngs){
      Scanner ab = new Scanner (System.in);
      System.out.println("masukan angka");
      int a = ab.nextInt();
      System.out.println("masukan angka kedua");
      int b = ab.nextInt();
      String awal = a>=b? ("lebih besar") : ("lebih kecil");
      System.out.println(a+"angka"+awal);
  }  
}
