import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("apel yang dimiliki ali");
        int apel_ali = ab.nextInt();
        System.out.println("apel yang akan dibagikan");
        int apel = ab.nextInt();
        System.out.printf("jadi sisa apel yang tersisa untuk ali %d",apel_ali%apel);
    }
}
