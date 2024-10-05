import java.util.Scanner;
public class Day34 {
    public static void main(String[]args){
        Scanner ab = new Scanner (System.in);
        //membuat scanner
        System.out.println("masukan gaji pokok");
        double gajipokok = ab.nextDouble();
        System.out.println("masukan jam lembur");
        int jamlembur = ab.nextInt();
        int bonuslembur = 10000;
        double total = bonuslembur * jamlembur;
        double gajibersih = gajipokok + total;
        System.out.println("gaji bersih yang diterima Rp"+gajibersih);
        
    }
}
