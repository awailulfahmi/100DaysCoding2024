import java.util.Scanner;
public class Day97 {
public static void main(String[] args) {
        Scanner ab = new Scanner (System.in);
        int a = ab.nextInt();
        for (int i=2; i<=a; i++){
            boolean sedikitlagi = true;
            for (int j = 2; j < i; j++){
                if (i %2 == 0){
                    sedikitlagi = false;
                    break;
                }
            }
            if (sedikitlagi){
                System.out.print(" "+i);
            }
        }
    }
}
