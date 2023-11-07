import java.util.Scanner;

public class perulangan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        System.out.println("Daftar film yang tersedia:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Film " + i);
        }

        System.out.println("Silakan masukkan nomor film yang ingin Anda tonton: ");
        pilihan = sc.nextInt();

        System.out.println("Anda memilih menonton Film " + pilihan);

        
    }
}
