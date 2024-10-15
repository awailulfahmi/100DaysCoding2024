import java.util.Scanner;
public class Day45 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        int a = ab.nextInt();
        
        if (a%2==0 ||a%3==0){
            System.out.println("habis di bagi angka genap dan ganjil");
        }
        else{
            System.out.println("cocoksi");
        }
    }
    
            
}
