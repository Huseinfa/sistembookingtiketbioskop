package Pratikum11;

import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String daftarFilm[] = {"Film 1", "Film 2", "Film 3"}, waktu[] = {"7.30 - 10.00", "11.30 - 15.00", "19.00 - 21.00"};
        String[][]studio = {{"Reguler : 25000"}, {"Premium : 30000"}, {" VIP    : 45000"}};
        int[] jumlahTiket = {30, 25, 10};
        int pilihanStudio, tiket, sesi;


        System.out.println("pilih film yang akan ditonton");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". " + daftarFilm[i] + " (" + waktu[i] + ")");
        }
        System.out.println("\n Input (1-3)");
        String film = sc.nextLine();


        System.out.println("Silahkan pilih studio yang diinginkan");
        for (int i = 0; i < studio.length; i++) {
            System.out.println((i + 1) + ". " + studio[i][0] + " (Tiket yang tersedia: " + jumlahTiket[i] + " tiket)");
        }
        System.out.println("\n Input (1-3)");
        pilihanStudio = sc.nextInt();
    
        
        System.out.println("Jumlah tiket yang ingin dipesan");
        tiket = sc.nextInt();

        
        sesi = pilihanStudio - 1;
        if (jumlahTiket[sesi] >= tiket) {
            System.out.println("Pesanan berhasil");
        } else {
            System.out.println("Maaf, Tiket telah habis");
        }


    }
}
