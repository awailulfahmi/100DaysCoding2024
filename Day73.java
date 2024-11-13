
package day69;
import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        String a = ab.nextLine();
        char b = ab.next().charAt(0);
        int c = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == b){
                c++;
            }
            
        }
        System.out.println("jumlah dari huruf "+b+" dalam string "+c); 
    }
}
