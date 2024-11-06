package day64;

public class Day67 {
   
    // Method void untuk mencetak pola persegi
    public void cetakPersegi(int persegi) {
        for (int a = 1; a <= persegi; a++) {
            for (int b = 1; b <= persegi; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Day67 ab = new Day67();
        
        ab.cetakPersegi(10);
    }
}
