import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;


public class tes2 {
    



    public static String generateKursi(int baris, int kolom) {
        int[][] kursi = new int[baris][kolom];

        // Menggabungkan nomor kursi ke dalam satu string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                kursi[i][j] = 0;
                result.append(kursi[i][j]).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String[][][] tambahDataBioskop(String[][][] sessions) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan informasi film baru:");

        System.out.print("Nama Film: ");
        String namaFilm = sc.nextLine();

        System.out.println("Pilih Waktu: ");
        System.out.println("[1]7.30-10.00");
        System.out.println("[2]10.00-12.30");
        System.out.println("[3]13.00-15.30");
        String InputwaktuFilm = sc.nextLine();

        String waktuFilm = "";
        if (InputwaktuFilm.equals("1")) {
            waktuFilm = "7.30-10.00";
        } else if (InputwaktuFilm.equals("2")) {
            waktuFilm = "10.00-12.30";
        } else if (InputwaktuFilm.equals("3")) {
            waktuFilm = "13.00-15.30";
        } else {
            System.out.println("Mohon Masukkan angka 1/2/3");
            return sessions;
        }

        System.out.println("Kategori Kursi: ");
        System.out.println("[1]Reguler");
        System.out.println("[2]Premium");
        System.out.println("[3]VIP");
        String InputkategoriKursi = sc.nextLine();

        String kategoriKursi = "";
        String hargaTiket = "";
        String jumlahKursi = "";
        if (InputkategoriKursi.equals("1")) {
            kategoriKursi = "Reguler";
            hargaTiket = "50.000";
            jumlahKursi = "50";
        } else if (InputkategoriKursi.equals("2")) {
            kategoriKursi = "Premium";
            hargaTiket = "75.000";
            jumlahKursi = "30";
        } else if (InputkategoriKursi.equals("3")) {
            kategoriKursi = "VIP";
            hargaTiket = "100.000";
            jumlahKursi = "20";
        } else {
            System.out.println("Mohon Masukkan angka 1/2/3");
            return sessions;
        }

        System.out.print("Jumlah Kolom Kursi: ");
        int kolom = sc.nextInt();
        System.out.print("Jumlah Baris Kursi: ");
        int baris = sc.nextInt();

        // Membuat array kursi untuk film baru
        String kursiBaru = generateKursi(baris, kolom);

        // Menambah data baru ke array bioskop
        String[][][] newSessions = new String[sessions.length + 1][][];
        System.arraycopy(sessions, 0, newSessions, 0, sessions.length);
        newSessions[sessions.length] = new String[][]{
                {namaFilm, waktuFilm, hargaTiket, jumlahKursi, kategoriKursi, kursiBaru}
        };

        System.out.println("Data baru berhasil ditambahkan!");

        return newSessions;
    }

    public static void tampilkanInformasiBioskop(String[][][] sessions) {
        System.out.println("Informasi Bioskop:");
        System.out.printf("=======================================================================================================%n");
        System.out.printf("| %-17s | %-17s | %-15s | %-10s | %-15s | %-10s | %n", "Kode sesi", "Film", "Waktu", "Harga", "Tiket Tersedia", "Kategori");
        System.out.printf("-------------------------------------------------------------------------------------------------------%n");

        int i = 1;
        for (String[][] jadwal : sessions) {
            System.out.printf("| %-17s | %-17s | %-15s | %-10s | %-15s | %-10s | %n", i++, jadwal[0][0], jadwal[0][1], jadwal[0][2], jadwal[0][3], jadwal[0][4]);
        }
        System.out.printf("=======================================================================================================%n");
        System.out.println();
    }
    
    public static String generateRandomCode() {
        int length = 4;
        Random random = new Random();
        StringBuilder randomCode = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomCode.append(characters.charAt(index));
        }

        return randomCode.toString();
    }


    public static void tampilKursi(int[][] kursi){
        for (int[] tampil : kursi) {
            System.out.println(Arrays.toString(tampil));
        }
    }

    public static int login(String user[],String pass[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String userInput = sc.nextLine();

        System.out.print("Password: ");
        String passInput = sc.nextLine();

        int index = -1;
        for (int i = 0; i < user.length; i++) {
            if (user[i].equals(userInput)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            if (pass[index].equals(passInput)) {
                System.out.println("Login Berhasil. Selamat datang, " + userInput + "!");
            } else {
                System.out.println("Password Salah.");
            }
        } else {
            System.out.println("User tidak ditemukan.");
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user[] = {"admin", "audric", "husein", "nadyne"};
        String pass[] = {"admin", "audric", "husein", "nadyne"};
        String role[] = {"admin", "kasir", "kasir", "kasir"};
        int index = -1;
        String Member[] = new String[100];

        String[][][] sessions = {
                {
                        {"Film A", "07.30-10.00", "50000", "50", "Reguler", generateKursi(5, 5)},
                        {"Film B", "10.00-12.30", "75000", "30", "Premium", generateKursi(5, 5)},
                        {"Film C", "13.00-15.30", "100000", "20", "VIP", generateKursi(5, 5)}
                }
                // You can add more sessions as needed
        };
        String[]daftarKategori = {"Reguler", "Premium", "VIP"};
        int[][]kursi = new int[3][4];
        int[] jumlahTiket = {30, 25, 10};
        int pilihanStudio, tiket = 0, sesi, menu = 0, harga = 0;
        int hargaReguler = 25000,hargaPremium = 30000,hargaVIP = 45000;
        int biayaMember = 70000;
        int totalBayar = 0;


        
    while (true) {
        if (index == -1) {
            System.out.println("Silahkan login terlebih dahulu");
            index = login(user,pass);
        }


        switch (role[index]) {
                case "admin":
                System.out.println("Pilih 1-3");
                System.out.println("[1]Laporan Pendapatan");
                System.out.println("[2]Input sesi baru");
                System.out.println("[3]Exit");
                menu = sc.nextInt();
                

                switch (menu) {
                    case 1:
                    System.out.printf("===================================%n");
                    System.out.println("         Laporan Pendapatan    ");
                    System.out.printf("-----------------------------------%n");
                    LocalDate tanggal = LocalDate.now();
                    System.out.println(tanggal);
                    System.out.println("Tiket yang terjual: " + tiket);
                    System.out.println("Hasil pendapatan: " + harga);
                    System.out.println();
                    break;

                    case 2:
                    System.out.println("Input Sesi Baru");
                    sessions = tambahDataBioskop(sessions);
                    break;

                    case 3:
                    index = -1;
                    break;
                    
                    default:
                    System.out.println("Tidak tersedia");

                }
                break;
                
                case "kasir":
                System.out.println("Pilih 1-3");
                System.out.println("[1]Pemesanan Tiket untuk Pelanggan");
                System.out.println("[2]Membership");
                System.out.println("[3]Logout");
                menu = sc.nextInt();

                switch (menu) {
                    case 1:
                    tampilkanInformasiBioskop(sessions);

                    System.out.println("Pilih film yang akan ditonton: ");
                    int film = sc.nextInt();
                
                    System.out.println("Jumlah tiket yang ingin dipesan");
                    tiket = sc.nextInt();
                    System.out.println("Pilih kursi anda: ");
            
                    tampilKursi(kursi);

                    for (int j = 0; j < tiket; j++) {
                        System.out.print("Masukkan baris: ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris > 0 && baris <= kursi[0].length && kolom > 0 && kolom <= kursi.length){
                            if (kursi[baris - 1][kolom - 1] == 0) {
                                kursi[baris - 1][kolom -1] = 1;
                                System.out.println("Pemesanan berhasil untuk kursi " + baris + ", " + kolom);
                                if (kolom == tiket) {
                                    tampilKursi(kursi);
                                }
                            } else {
                                System.out.println("Kursi tidak tersedia");
                                System.out.println("Mohon Pilih kursi yang lain");
                                j--;
                            }
                    } else {
                        System.out.println("Kursi tidak valid, Mohon masukkan kursi yang tersedia");
                        j--;
                    }
                    }
                    if(daftarKategori[film - 1].equalsIgnoreCase("Reguler"))
                    {
                        harga = hargaReguler * tiket;
                    }
                    else if (daftarKategori[film - 1].equalsIgnoreCase("Premium"))
                    {
                        harga = hargaPremium * tiket;

                    }
                    else if (daftarKategori[film - 1].equalsIgnoreCase("VIP"))
                    {
                        harga = hargaVIP * tiket;

                    }
                    System.out.println("Total bayar anda adalah: " + harga);
                    System.out.println("Apakah anda Memiliki Membership? (y/n)");
                    String isMember = sc.nextLine();

                    if (isMember.equalsIgnoreCase("y")) {
                        System.out.println("Masukkan Kode Member anda");
                        String kodeMember = sc.nextLine();
                        for (int i = 0; i < Member.length; i++) {
                            
                            if (kodeMember.equals(Member[i])) {
                                System.out.println("Selamat anda Mendapatkan potongan sebesar 99%");
                                totalBayar = harga - (harga * 99 / 100);
                                System.out.println("Total Bayar " + totalBayar);
                                break;
                            }
                        }
                    }
                    break;

                    case 2:
                    System.out.println("Daftar Membership: ");
                    System.out.println("Harga Membership adalah " + biayaMember );
                    System.out.println("Apakah anda ingin melanjutkan? (y/n)");
                    sc.nextLine();
                    String validMember = sc.nextLine();

                    if (validMember.equalsIgnoreCase("y")) {
                                String randomCode = generateRandomCode();
                                System.out.println("Generated random code: " + randomCode);
                                    for (int i = 0; i < Member.length; i++) {
                                    if (Member[i] == null) {
                                        Member[i] = randomCode;
                                        System.out.println("Random code successfully stored in Membership array.");
                                        break;
                                    }
                                }
                                for (int i = 0; i < Member.length; i++) {
                                    if (Member[i] == null) {
                                        continue;
                                    }
                                    System.out.println(Member[i]);
                                }
                        break;
                        
                    } else {
                        break;
                    }
                    case 3:
                    index = -1;
                    break;

                    default:
                    System.out.println("Tidak tersedia");
                        break;
                }
            }
        }
    }
    
}
