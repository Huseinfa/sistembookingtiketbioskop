import java.util.Scanner;
import java.time.LocalDate;

public class bookingbioskopFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user[] = {"nadyne","audric","husein","1"};
        String pass[] = {"kasir1","kasir2","kasir3","1"};
        int adminId[] = {123,124};
        int adminPin[] = {123,124};
        String role[] = {"kasir", "Admin"};
        String Member[] = {"A123","B123"};
        String daftarFilm[] = {"Film 1", "Film 2", "Film 3"}, waktu[] = {"7.30 - 10.00", "11.30 - 15.00", "19.00 - 21.00"};
        String[][]daftarKategori = {{"Reguler"}, {"Premium"}, {" VIP"}};
        int[][]kursi = new int[3][4];
        int[] jumlahTiket = {30, 25, 10};
        int pilihanStudio, tiket, sesi;
        int hargaReguler = 25000,hargaPremium = 30000,hargaVIP = 45000;
        boolean login = false,isUsernameValid = false,isPasswordValid=false,isAdminId =false,isAdminPin = false;
        int menu = 0;


        

        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                kursi[i][j] = 0;
            }
        }

        System.out.println("Silahkan login terlebih dahulu");
        System.out.println("Pilih angka sesuai tingkatan anda 1-2");
        System.out.println("1.Kasir");
        System.out.println("2.Admin");
        int level = sc.nextInt();
        sc.nextLine();

        if (level == 1) {
            
            System.out.println("Username: ");
            String uName = sc.nextLine();
            System.out.println("Password: ");
            String pin = sc.nextLine();
    
            for (int i = 0; i < user.length; i++) {
                if (uName.equalsIgnoreCase(user[i])) {
                        System.out.println("Selamat datang " + uName + "");
                        isUsernameValid = true;
                    if (pin.equals(pass[i])) {
                        isPasswordValid = true;
                        break;
                    }
                } else{
                    isUsernameValid = false;
                    isPasswordValid = false;
                    
                }
                
            }
    
            do {
                if (isUsernameValid && isPasswordValid) {
                System.out.println("");
    
    
                System.out.println("Pilih 1-3");
                System.out.println("1.Pemesanan Tiket untuk Pelanggan");
                System.out.println("2.Input sesi baru");
                System.out.println("3.Exit");
                menu = sc.nextInt();
    
                switch (menu) {
                    case 1:
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
                
                    //Menampilkan Kursi
                    System.out.println("Jumlah tiket yang ingin dipesan");
                    tiket = sc.nextInt();
                    System.out.println("Pilih kursi anda: ");
                    // for (int i = 0; i < kursi.length; i++) {
                    //     for (int j = 0; j < kursi[i].length; j++) {
                    //         System.out.printf("| %-10d |%n", kursi[i][j]);
                    //     }
                    //     System.out.println();
                    //     }
                    tampilKursi(kursi);

                        //Input Layout
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

                    System.out.println("Total bayar anda adalah: " + hargaPremium * tiket);
                    break;
    
                    case 2:
                    System.out.println("Input Sesi Baru: ");
                    break;
                }
                }
        
            } while (menu != 3);
        }else if (level == 2) {
            System.out.println("Id Admin: ");
            int id = sc.nextInt();
            System.out.println("Pin Admin: ");
            int pin = sc.nextInt();
    
            for (int i = 0; i < adminId.length; i++) {
                if (id == adminId[i]) {
                        System.out.println("Selamat datang Admin");
                        isAdminId = true;
                    if (pin == adminPin[i]) {
                        isAdminPin = true;
                        break;
                    }
                } else{
                    isAdminId = false;
                    isAdminPin = false;
                    
                }
                
            }

            
        }

        do {
            if (isAdminId && isAdminPin) {
                System.out.println("");
    
    
                System.out.println("Pilih 1-3");
                System.out.println("1.Laporan Pendapatan");
                System.out.println("2.Input sesi baru");
                System.out.println("3.Exit");
                menu = sc.nextInt();
                

                switch (menu) {
                    case 1:
                    LocalDate tanggal = LocalDate.now();
                    System.out.println(tanggal);
                        
                        break;

                    case 2:
                    break;
                }
            
                
                
            }
        } while (menu !=3);
    }


    public static void tampilKursi(int[][] kursi){
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                System.out.printf("| %-10d |", kursi[i][j]);
                }
                System.out.println();
                }
    }

//     public static void addArray()

}
