import java.util.Scanner;

public class daftarFilm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String daftarFilm[] = {"Film 1", "Film 2", "Film 3"}, waktu[] = {"7.30 - 10.00", "11.30 - 15.00", "19.00 - 21.00"};
        String[][] daftarKategori = {{"Reguler : 25000"}, {"Premium : 30000"}, {" VIP    : 45000"}};
        int[] jumlahTiket = {30, 25, 15};

        System.out.printf("=====================================================================================%n");
        System.out.printf("| %-10s | %-17s | %-17s | %-15s | %-10S | %n|", "Kode sesi", "FILM", "WAKTU", "KATEGORI", "TIKET");
        System.out.printf("------------------------------------------------------------------------------------%n");

        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.printf("| %-10d | %-17s | %-17s | %-10s | %-10s | %n",i + 1 , daftarFilm[i], waktu[i], daftarKategori[i][0], jumlahTiket[i]);
        }
        System.out.printf("=====================================================================================%n");
        System.out.println();

        System.out.println("Pilih film yang akan ditonton: ");
        int film = sc.nextInt();
        System.out.println("Jumlah tiket yang dipesan: ");
        int tiket = sc.nextInt();

        int sesi = film - 1;
        if (jumlahTiket[sesi] >= tiket) {
            System.out.println("Pesanan berhasil");
        } else {
            System.out.println("Maaf, Tiket telah habis");
        }
    }
}
