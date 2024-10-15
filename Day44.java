
import java.util.Scanner;
public class Day44 {

    public static void main(String[] args) {
    Scanner ab = new Scanner(System.in);
    int n = ab.nextInt();
    
    if (n%3==0 && n%5==0){
        System.out.println("nice");
    }else if(n%3==0){
        System.out.println("habis dibagi 3");
        
    }else if (n%5==0){
        System.out.println("habis di bagi 5");
    }
        else 
            System.out.println("nt");
        }
    }
    

