import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;


public class bookingbioskopFIX {

    private static String generateKursi(int baris, int kolom) {
        int[][] kursi = new int[baris][kolom];
        StringBuilder seatMap = new StringBuilder();
    
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                kursi[i][j] = 0;
                seatMap.append(kursi[i][j]);
                if (j < kolom - 1) {
                    seatMap.append(",");
                }
            }
            if (i < baris - 1) {
                seatMap.append(" ");
            }
        }   
        return seatMap.toString();
    }    

    public static void tampilKursi(int[][] kursi){
        for (int[] tampil : kursi) {
            System.out.println(Arrays.toString(tampil));
        }
    }

    private static String convert2DArrayToString(int[][] seatArray) {
        StringBuilder seatMap = new StringBuilder();
    
        for (int i = 0; i < seatArray.length; i++) {
            for (int j = 0; j < seatArray[0].length; j++) {
                seatMap.append(seatArray[i][j]);
                if (j < seatArray[0].length - 1) {
                    seatMap.append(",");
                }
            }
            if (i < seatArray.length - 1) {
                seatMap.append(" ");
            }
        }
        return seatMap.toString();
    }

    private static int[][] convertStringTo2DArray(String seatMap) {
        // Split the string into individual seat values
        String[] rowStrings = seatMap.split(" ");
        
        // Convert each seat value to integer and store in a 2D array
        int numRows = rowStrings.length;
        int numCols = rowStrings[0].split(",").length;
        int[][] seatArray = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            String[] seatValues = rowStrings[i].split(",");
            for (int j = 0; j < numCols; j++) {
                seatArray[i][j] = Integer.parseInt(seatValues[j]);
            }
        }
        return seatArray;
    }

    private static String[][] tambahDataBioskop(String[][] bioskop) {
        Scanner sc = new Scanner(System.in);
        String waktuFilm = "";  // Declare variables outside of if-else blocks
        String hargaTiket = "";
        String jumlahKursi = "";
        String kategoriKursi = "";

        System.out.println("Masukkan informasi film baru:");

        System.out.print("Nama Film: ");
        String namaFilm = sc.nextLine();


        System.out.println("Pilih Waktu: ");
        System.out.println("[1]7.30-10.00");
        System.out.println("[2]10.00-12.30");
        System.out.println("[3]13.00-15.30");
        String InputwaktuFilm = sc.nextLine();
        // if (waktuFilm != "1" || waktuFilm != "2" || waktuFilm != "3") {
        // System.out.println("Mohon Masukkan angka 1/2/3");
        // break;
        // }
        if (InputwaktuFilm.equals("1")) {
            waktuFilm = "7.30-10.00";
        } else if (InputwaktuFilm.equals("2")) {
            waktuFilm = "10.00-12.30";
        } else if (InputwaktuFilm.equals("3")) {
            waktuFilm = "13.00-15.30";
        } else {
            System.out.println("Mohon Masukkan angka 1/2/3");
            return bioskop;
        }

        System.out.println("Kategori Kursi: ");
        System.out.println("[1]Reguler");
        System.out.println("[2]Premium");
        System.out.println("[3]VIP");
        String InputkategoriKursi = sc.nextLine();

        if (InputkategoriKursi.equals("1")) {
        kategoriKursi = "Reguler";
        hargaTiket = "50000";
        jumlahKursi = "50";
        } else if (InputkategoriKursi.equals("2")) {
        kategoriKursi = "Premium";
        hargaTiket = "75000";
        jumlahKursi = "30";
        } else if (InputkategoriKursi.equals("3")) {
        kategoriKursi = "VIP";
        hargaTiket = "100000";
        jumlahKursi = "20";
        } else {
        System.out.println("Mohon Masukkan angka 1/2/3");
        return bioskop; // Return bioskop without adding new data
        }

        System.out.print("Jumlah Kolom Kursi: ");
        int kolom = sc.nextInt();
        System.out.print("Jumlah Baris Kursi: ");
        int baris = sc.nextInt();

        // Membuat array kursi untuk film baru
        String kursiBaru = generateKursi(baris, kolom);

        // Menambah data baru ke array bioskop
        String[][] bioskopBaru = new String[bioskop.length + 1][6];
        System.arraycopy(bioskop, 0, bioskopBaru, 0, bioskop.length);
        bioskopBaru[bioskop.length] = new String[]{namaFilm, waktuFilm, hargaTiket, jumlahKursi, kategoriKursi, kursiBaru};


        System.out.println("Data baru berhasil ditambahkan!");

        return bioskopBaru;
    }

    public static void tampilkanInformasiBioskop(String[][] bioskop) {

        System.out.println("Informasi Bioskop:");
            System.out.printf("=======================================================================================================%n");
            System.out.printf("| %-17s | %-17s | %-15s | %-10s | %-15s | %-10s | %n", "Kode sesi", "Film", "Waktu", "Harga","Tiket Tersedia", "Kategori");
            System.out.printf("-------------------------------------------------------------------------------------------------------%n");

            int i = 1;
            for (String[] jadwal : bioskop) {
            System.out.printf("| %-17s | %-17s | %-15s | %-10s | %-15s | %-10s | %n", i++, jadwal[0], jadwal[1], jadwal[2], jadwal[3], jadwal[4]);
            }
            System.out.printf("=======================================================================================================%n");
            System.out.println();
        }

    private static String generateRandomCode() {
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

    public static int login(String[][] user){
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String userInput = sc.nextLine();

        System.out.print("Password: ");
        String passInput = sc.nextLine();

        int index = -1;
        
        for(int i = 0; i < user.length; i++)
        {
            if (userInput.equalsIgnoreCase(user[i][0]))
            {
                // lanjut
                if(passInput.equalsIgnoreCase(user[i][1]))
                {
                    index = i;
                }else {
                    System.out.println("User Tidak di Temukan!");
                }
            }

        }
        System.out.println("Selamat datang " + userInput);
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] user = {
            {"husein","husein","kasir"},
            {"admin","admin","admin"},
            {"audric","audric","kasir"},
            {"nadyne","nadyne","kasir"}
        };

        int index = -1;
        String Member[] = new String[100];


        String[][] bioskop = {
            {"Film A", "07.30-10.00", "25000", "50", "Reguler", generateKursi(5, 5)},
            {"Film B", "10.00-12.30", "30000", "30", "Premium", generateKursi(5, 5)},
            {"Film C", "13.00-15.30", "45000", "20", "VIP", generateKursi(5, 5)}
        };

        String[]daftarKategori = {"Reguler", "Premium", "VIP"};
        int[][]kursi = new int[3][4];
        int[] jumlahTiket = {30, 25, 10};
        int pilihanStudio, tiket = 0, sesi, menu = 0, harga = 0;
        int hargaReguler = 25000,hargaPremium = 30000,hargaVIP = 45000;
        int biayaMember = 70000;
        int totalBayar = 0;


        
    while (true) {
        while (true) {
            if (index == -1) {
                System.out.println("Silahkan login terlebih dahulu");
                index = login(user);
            }
            else
            {
                break;
            }
        }

        switch (user[index][2]) {
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
                    bioskop = tambahDataBioskop(bioskop);
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
                    tampilkanInformasiBioskop(bioskop);
                
                    System.out.println("Pilih film yang akan ditonton: ");
                    int film = sc.nextInt();
                    int indexFilm = film - 1;
                    System.out.println("Jumlah tiket yang ingin dipesan");
                    tiket = sc.nextInt();
                    System.out.println("Pilih kursi anda: ");
                    tampilKursi(convertStringTo2DArray(bioskop[indexFilm][5]));

                    for (int j = 0; j < tiket; j++) {
                        System.out.print("Masukkan baris: ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan Kolom: ");
                        int kolom = sc.nextInt();
                        sc.nextLine();

                        int[][] newKursi = convertStringTo2DArray(bioskop[indexFilm][5]); 
                
                        if (baris > 0 && baris <= newKursi.length && kolom > 0 && kolom <= newKursi[0].length) {
                            if (newKursi[baris - 1][kolom - 1] == 0) {
                                newKursi[baris - 1][kolom - 1] = 1;
                                System.out.println("Pemesanan berhasil untuk kursi " + baris + ", " + kolom);
                                // Update the main variable bioskop
                                bioskop[indexFilm][5] = convert2DArrayToString(newKursi);
                                if (kolom == tiket) {
                                    tampilKursi(newKursi);
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
                    if (bioskop[indexFilm][4].equalsIgnoreCase("Reguler")) {
                        harga = hargaReguler * tiket;
                    } else if (bioskop[indexFilm][4].equalsIgnoreCase("Premium")) {
                        harga = hargaPremium * tiket;
                
                    } else if (bioskop[indexFilm][4].equalsIgnoreCase("VIP")) {
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
                                System.out.println("Selamat anda Mendapatkan potongan sebesar 20%");
                                totalBayar = harga - (harga * 20 / 100);
                                System.out.println("Total Bayar " + totalBayar);
                                
                                break;
                            }
                        }
                    } else if (isMember.equalsIgnoreCase("n")) {
                            totalBayar = harga;
                                System.out.println("Total Bayar " + totalBayar);
                                
                    }
                    System.out.println("Apakah Anda ingin cetak struk? (y/n)");
                    String struk = sc.nextLine();

                    if (struk.equalsIgnoreCase("y")) {
                    System.out.printf("===================================%n");
                    System.out.println("         Struk Pembelian    ");
                    System.out.printf("-----------------------------------%n");
                    LocalDate tanggal = LocalDate.now();

                    System.out.println("Bioskop Menarik");
                    System.out.println("Film: " + bioskop[indexFilm][0]);
                    System.out.println("Kategori: " + bioskop[indexFilm][4]);
                    System.out.println(tanggal);
                    System.out.println("Jam : " + bioskop[indexFilm][1]);
                    System.out.println("Tiket yang Dibeli : " + tiket);
                    System.out.println("Harga Tiket: " + harga);
                    System.out.println("Total Bayar: " + totalBayar);
                    System.out.println();
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