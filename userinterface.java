import java.sql.SQLOutput;
import java.util.Scanner;

public class userinterface {
    public  static void tampilkanmenu(){
        System.out.println();
        System.out.println("+=============+");
        System.out.println("| Pilih menu:  |");
        System.out.println("+-------------+");
        System.out.println("| [C]: Create  |");
        System.out.println("| [R]: Read    |");
        System.out.println("| [U]: Update  |");
        System.out.println("| [D]: Delete  |");
        System.out.println("| [X]: Exit    |");
        System.out.println("+=============+");
    }

    public static void main(String[] args) {
        database db = new database();
        System.out.println("APLIKASI SIMPLE CRUD TEXT DATABASE");
        while (true){
            tampilkanmenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Pilih : ");
            String pilihan = sc.nextLine();
            pilihan = pilihan.toUpperCase();

            switch (pilihan){
                case "C":
                    System.out.println("INFO : Anda memilih menu Create");
                    System.out.println("----------------------------------------------------");
                    System.out.println("INPUT DATA BARU");
                    System.out.print("NIM             :");
                    String nim = sc.nextLine();
                    System.out.print("NAMA MAHASISWA  :");
                    String nama = sc.nextLine();
                    System.out.print("ALAMAT          :");
                    String alamat = sc.nextLine();
                    System.out.print("SEMESTER        :");
                    int semester = sc.nextInt();
                    System.out.print("SKS             :");
                    int sks = sc.nextInt();
                    System.out.print("IPK             :");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("-----------------------------------------------");
                    boolean status = db.insert(nim, nama, alamat, semester, sks, ipk);
                    if(status==true){
                        System.out.println("DATA BARU BERHASIL DITAMBAHKAN");

                    }
                    else{
                        System.out.println("NIM "+nim+"Sudah ada di database");
                        System.out.println("GAGAL MENAMBAHKAN DATA");
                    }
                    break;
                case "R":
                    System.out.println("INFO : Anda memilih menu Read");
                    db.viuw();
                    break;
                case"U":
                    System.out.println("INFO : Anda memilih menu Update");
                    db.viuw();
                    System.out.println("Input Key (NIM Mahasiswa yang akan di update): ");
                    String key = sc.nextLine();
                    int index = db.search(key);
                    if(index >= 0){
                        System.out.println("Anda mengapdate data" +db.getData().get(index));
                        System.out.println("--------------------------------------------");
                        System.out.println("INPUT DATA BARU");
                        System.out.print("NIM             :");
                        nim = sc.nextLine();
                        System.out.print("NAMA MAHASISWA  :");
                        nama = sc.nextLine();
                        System.out.print("ALAMAT          :");
                        alamat = sc.nextLine();
                        System.out.print("SEMESTER        :");
                        semester = sc.nextInt();
                        System.out.print("SKS             :");
                        sks = sc.nextInt();
                        System.out.print("IPK             :");
                        ipk = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("-------------------------------------------");
                        status = db.update(index, nim, nama, alamat, semester, sks, ipk);
                        if(status==true){
                            System.out.println("DATA BERHASIL DI PERBARUI");
                        }
                        else{
                            System.err.println("GAGAL MEMPERBARUI DATA");
                        }
                        System.out.println("--------------------------------------------");
                    }
                    else{
                        System.err.println("Mahasiswa dengan NIM: "+key+"tidak ada dalam data base");
                    }
                    break;
                case "D":
                    System.out.println("INFO: Anda memilih menu Delete");
                    db.viuw();
                    System.out.println("Input key ( NIM Mahasiswa yang akan di hapus) :");
                    key = sc.nextLine();
                    index = db.search(key);
                    if(index >= 0){
                        System.out.println("APAKAH ANDA INGIN MENGHAPUS DATA "+ db.getData().get(index)+"YA/TIDAK");
                        System.out.print("Pilihan :");
                        pilihan = sc.nextLine();
                        if(pilihan.equalsIgnoreCase("YA")){
                            status = db.delete(index);
                            if(status==true){
                                System.out.println("DATA BERHASIL DI HAPUS");
                            }
                            else{
                                System.err.println("GAGAL MENGHAPUS DATA");
                            }
                        }
                    }
                    break;
                case"X":
                    System.out.println("INFO: Anda memilih menu EXIT");
                    System.out.println("APAKAH ANDA YAKIN AKAN KELUAR DARI APLIKASI YA/TIDAK");
                    System.out.println("Pilih : ");
                    pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("YA")){
                        System.exit(0);
                    }
                    break;

            }
        }
    }
}
