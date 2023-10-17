import java.util.Scanner;

    public class FlowcharTest {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String pemilihanFilm, pemilihanKursi;
            double harga;

            System.out.print("Pilih Kode Film: (A, B, C) ");
            pemilihanFilm = sc.nextLine();


            switch (pemilihanFilm.toLowerCase()){
                case "A":
                pemilihanFilm = "Film A";
                    System.out.println( "Anda Memilih Film " + pemilihanFilm);

                    break;
                case "B":
                pemilihanFilm = "Film B";
                    System.out.println( "Anda Memilih Film " + pemilihanFilm);

                    break;
                case "C":
                    System.out.println( "Anda Memilih Film " + pemilihanFilm);
                default:
                    // pemilihanFilm = "Film tidak tersedia";

            }
                            // System.out.println( "Anda Memilih Film " + pemilihanFilm);
        }
    
}

