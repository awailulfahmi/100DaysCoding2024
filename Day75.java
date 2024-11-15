package day69;
import java.util.Scanner;
public class Day75 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("masukan klimat");
        String a = ab.nextLine();
        System.out.println("masukan kalimat");
        String b = ab.nextLine();
        
        if(a.toLowerCase().equals(b.toLowerCase())){
            System.out.println("kedua kalimat sama");
        }
        else{
            System.out.println("kedua kalimat berbdea");
        }
    }
}
