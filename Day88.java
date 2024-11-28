package day69;

public class Day88 {

    public static void main(String[] args) {
        int[] nilai = {90, 40, 50, 100, 80, 30, 88, 75, 55, 35};
        double total = 0;
        for (int i : nilai) {
            total += i;

        }
        double rata = total / nilai.length;
        int nilai_paling_tinggi = nilai[0];
        int nilai_terendah = nilai[0];
        for (int i : nilai) {
            if (i > nilai_paling_tinggi) {
                nilai_paling_tinggi = i;
            }
            if (i < nilai_terendah) {
                nilai_terendah = i;
            }
        }
        int c = 0;
        for (int i : nilai) {
            if (i > rata) {
                c++;
            }

        }
        System.out.println("Nilai rata-rata :" + rata);
        System.out.println("Nilai paling tinggi : " + nilai_paling_tinggi);
        System.out.println("Nilai terendah : " + nilai_terendah);
        System.out.println("jumlah siswa di atas rata - rata : " + c);
    }
}
