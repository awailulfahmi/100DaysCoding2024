import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        System.out.println("masukan angka");
        long a = ab.nextLong();
        System.out.println("masukan angka kedua");
        long b = ab.nextLong();
        
        if (a>b){
            System.out.println("angka a lebih besar");    
        }
        else{
            System.out.println("angka b lebih besar");
        }
    }
  
}
