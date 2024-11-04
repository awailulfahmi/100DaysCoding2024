public class Day64 {
    
    public static void main(String[] args) {
        awal:
        for (int a = 0; a <= 5; a++) {
            for (int b = 0; b <= 5; b++) {
                System.out.println("angka a ke-" + a + ", angka b ke- " + b);
                if (b == 3) {
                    break awal;
                }
            }
        }
    }
}
