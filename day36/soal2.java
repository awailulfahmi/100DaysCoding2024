import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Permen yang dimiliki guru");
        int permen = ab.nextInt();
        System.out.println("jumlah murid yang akan dibagikan permen");
        int murid = ab.nextInt();
        System.out.printf("jadi permen yang akan di terima setiap murid %d",permen/murid);
    }
}
