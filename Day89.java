package day69;
import java.util.Scanner;
public class Day89 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        String hasil = kapital(kalimat);
        System.out.println(hasil);
    }

    public static String kapital(String kalimat) {

        String[] a = kalimat.split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String b : a) {
            if (!b.isEmpty()) {
                char hurufPertama = Character.toUpperCase(b.charAt(0));
                String sisaHuruf = b.substring(1).toLowerCase();
                hasil.append(hurufPertama).append(sisaHuruf).append(" ");
            }
        }

        return hasil.toString().trim();
    }
}
