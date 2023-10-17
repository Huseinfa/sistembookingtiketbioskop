import java.util.Scanner;

public class sistembookingnested {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String film = "", kursi = "";
        int hargaReguler = 25000, hargaPremium = 30000 , hargaVIP = 45000;

        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|   Film Yang ingin Ditonton    |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|           Film A              |");
        System.out.println("|           Film B              |");
        System.out.println("|           Film C              |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        film = sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|   Pilih kelas kursi anda:     |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|           Reguler             |");
        System.out.println("|           Premium             |");
        System.out.println("|           VIP                 |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        kursi = sc.nextLine();

    if ((film.equalsIgnoreCase("Film A"))){
            if (kursi.equalsIgnoreCase("Reguler")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film A Kursi Reguler             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaReguler + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("Premium")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film A Kursi Premium             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaPremium + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("VIP")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film A Kursi VIP                 |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |           Total Bayar Anda adalah: " + hargaVIP + "     |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else{
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|               Kelas Kursi Tidak Tersedia                |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");    
            }
    }else if ((film.equalsIgnoreCase("Film B"))){
                if (kursi.equalsIgnoreCase("Reguler")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film B Kursi Reguler             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaReguler + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("Premium")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film B Kursi Premium             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaPremium + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("VIP")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film B Kursi VIP                 |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |           Total Bayar Anda adalah: " + hargaVIP + "     |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else{
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|               Kelas Kursi Tidak Tersedia                |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");    
                }
        }else if ((film.equalsIgnoreCase("Film C"))){
                if (kursi.equalsIgnoreCase("Reguler")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film C Kursi Reguler             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaReguler + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("Premium")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film C Kursi Premium             |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |            Total Bayar Anda adalah: " + hargaPremium + "|");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else if (kursi.equalsIgnoreCase("VIP")){
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|           Anda Memilih Film C Kursi VIP                 |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("  |           Total Bayar Anda adalah: " + hargaVIP + "     |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }else{
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("|               Kelas Kursi Tidak Tersedia                |");
        System.out.println("|                                                         |");
        System.out.println("|                                                         |");
        System.out.println("-----------------------------------------------------------");
                }
    }else {
    System.out.println("-----------------------------------------------------------");
    System.out.println("|                                                         |");
    System.out.println("|                                                         |");
    System.out.println("|                                                         |");
    System.out.println("|            Film yang Anda pilih Tidak Tersedia          |");
    System.out.println("|                                                         |");
    System.out.println("|                                                         |");
    System.out.println("-----------------------------------------------------------");
        }
    }
}
