package day100;

import java.util.Scanner;
import java.time.LocalTime;

public class Day100 {

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        String nama = ab.nextLine();
        LocalTime waktu = LocalTime.now();

        String salam;
        if (waktu.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi";
        }
        else if(waktu.isBefore(LocalTime.of(17, 0))){
            salam = "Selamat siang";
        }
        else{
            salam = "Selamat malam";
        }
        System.out.println(salam +", "+ nama );
    }

}
