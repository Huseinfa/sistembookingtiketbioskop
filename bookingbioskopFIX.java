import java.util.Scanner;

public class bookingbioskopFIX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user[] = {"nadyne","audric","husein"};
        String pass[] = {"kasir1","kasir2","kasir3"};
        int adminId[] = {123,124};
        int adminPin[] = {123,124};
        String daftarFilm[] = {"Film 1", "Film 2", "Film 3"}, waktu[] = {"7.30 - 10.00", "11.30 - 15.00", "19.00 - 21.00"};
        String[][]studio = {{"Reguler : 25000"}, {"Premium : 30000"}, {" VIP    : 45000"}};
        int[] jumlahTiket = {30, 25, 10};
        int pilihanStudio, tiket, sesi;
        int hargaReguler = 25000,hargaPremium = 30000,hargaVIP = 45000;
        boolean login = false,isUsernameValid = false,isPasswordValid=false,isAdminId =false,isAdminPin = false;
        int menu = 0;


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
                        System.out.println("Selamat datang " + uName);
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
                    System.out.println("Silahkan Pilih Film dan sesi");
                    for (int i = 0; i < daftarFilm.length; i++) {
                        System.out.println((i + 1) + ". " + daftarFilm[i] + " (" + waktu[i] + ")");
                    }
                    System.out.println("\n Input (1-3)");
                    int film = sc.nextInt();
                    sc.nextLine();
                
                
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
                
                    if (pilihanStudio == 1) {
                        System.out.println("Pesanan berhasil");
                        System.out.println("Total Bayar anda adalah :" + tiket * hargaReguler);
                        break;
                
                        
                    }else if (pilihanStudio == 2) {
                        System.out.println("Total Bayar anda adalah :" + tiket * hargaPremium);
                        break;
                    }else if (pilihanStudio == 3) {
                        System.out.println("Total Bayar anda adalah :" + tiket * hargaVIP);
                        break;
                    }
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
            
            
                
                
            }
        } while (menu !=3);
    }

}