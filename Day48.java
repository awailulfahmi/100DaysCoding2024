import java.util.Scanner;
public class Day48 {
  public static void main(String[]arngs) {
      Scanner awal = new Scanner (System.in);
      System.out.println("masukan sebuah angka");
      int a = awal.nextInt();
      if(2/a==0){
          System.out.println("angka positif");
      }
      else if(a/2==1){
          System.out.println("angka negatif");
      }
  } 
}
