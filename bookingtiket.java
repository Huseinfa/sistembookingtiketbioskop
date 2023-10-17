import java.util.Scanner;
public class bookingtiket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("film yang ingin ditonton");
        char namaFilm = sc.next().charAt(0);

        switch (namaFilm){
            case 'a':
                System.out.println("anda memilih film a");
                break;
            case 'b':
                System.out.println("anda memilih film b");
                break;
            case 'c':
                System.out.println("anda memilih film c");
                break;
            default:
            System.out.println("film tidak tersedia");
            return;
        }

        System.out.println("tipe kursi yang digunakan ");
        char tipeKursi = sc.next().charAt(0);

        switch (tipeKursi){
            case 'a':
                System.out.println("kursi reguler");
                break;
            case 'b':
                System.out.println("kursi premium");
                break;
            case 'c':
                System.out.println("kursi VIP");
                break;
            default:
                System.out.println("tipe kursi tidak tersedia");
                return;
}
}
}