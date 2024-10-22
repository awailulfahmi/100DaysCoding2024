import java.util.Scanner;
public class Day51 {
  public static void main (String[]arngs){
  Scanner ab = new Scanner (System.in);
      System.out.println("selamat datang di pencari jodoh ");
      System.out.println("pilih tirai yang berisi cewe leadis ");
      System.out.println("tirai 1  tirai 2  tirai 3");
        int a= ab.nextInt();
        
        switch(a){
            case 1:
                System.out.println("zonk");
            break;
            case 2:
                System.out.println("spek yali yali");
            break;
            case 3:
                System.out.println("zonk");
            break;
            default:
                System.out.print("anda tidak berintung");
            break;
        }
    }
}
