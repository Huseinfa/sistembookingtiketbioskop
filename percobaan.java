import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String film = "", kursi = "";
        int hargaReguler = 25000, hargaPremium = 30000, hargaVIP = 45000, menu;

        while (true) {
            System.out.println("|   Pilih Film Yang ingin Ditonton    |");
            System.out.println("1. Film Joker   ");
            System.out.println("2. Film Nemo    ");
            System.out.println("3. Film Dora    ");
            film = sc.nextLine();

            System.out.println("|   Pilih Kelas Kursi Anda:     |");

            System.out.println("1. Reguler");
            System.out.println("2. Premium");
            System.out.println("3. VIP");

            kursi = sc.nextLine();

            // Film 1
            if (film.equals("1")) {
                if (kursi.equals("1")) {
                    System.out.println("Anda Memilih Film Joker Kursi Reguler");
                    System.out.println("Total Bayar Anda adalah: " + hargaReguler);
                } else if (kursi.equals("2")) {
                    System.out.println("Anda Memilih Film Joker Kursi Premium");
                    System.out.println("Total Bayar Anda adalah: " + hargaPremium);
                } else if (kursi.equals("3")) {
                    System.out.println("Anda Memilih Film Joker Kursi VIP");
                    System.out.println("Total Bayar Anda adalah: " + hargaVIP);
                } else {
                    System.out.println("Kelas Kursi Tidak Tersedia");
                }
            }
            // Film 2
            else if (film.equals("2")) {
                if (kursi.equals("1")) {
                    System.out.println("Anda Memilih Film Nemo Kursi Reguler");
                    System.out.println("Total Bayar Anda adalah: " + hargaReguler);
                } else if (kursi.equals("2")) {
                    System.out.println("Anda Memilih Film Nemo Kursi Premium");
                    System.out.println("Total Bayar Anda adalah: " + hargaPremium);
                } else if (kursi.equals("3")) {
                    System.out.println("Anda Memilih Film Nemo Kursi VIP");
                    System.out.println("Total Bayar Anda adalah: " + hargaVIP);
                } else {
                    System.out.println("Kelas Kursi Tidak Tersedia");
                }
            }
            // Film 3
            else if (film.equals("3")) {
                if (kursi.equals("1")) {
                    System.out.println("Anda Memilih Film Dora Kursi Reguler");
                    System.out.println("Total Bayar Anda adalah: " + hargaReguler);
                } else if (kursi.equals("2")) {
                    System.out.println("Anda Memilih Film Dora Kursi Premium");
                    System.out.println("Total Bayar Anda adalah: " + hargaPremium);
                } else if (kursi.equals("3")) {
                    System.out.println("Anda Memilih Film Dora Kursi VIP");
                    System.out.println("Total Bayar Anda adalah: " + hargaVIP);
                } else {
                    System.out.println("Kelas Kursi Tidak Tersedia");
                }
            } else {
                System.out.println("Film yang Anda pilih Tidak Tersedia");
            }

            // lanjut atau tidak
            System.out.println("Ingin melanjutkan? (Ya/Tidak): ");
            String lanjut = sc.nextLine();

            if (!lanjut.equalsIgnoreCase("Ya")) {
                break; // keluar dari loop jika tidak lanjut
            }
        }
    }
}


