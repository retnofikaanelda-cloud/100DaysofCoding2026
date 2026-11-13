package Day073;
import java.util.Scanner;
public class Day073 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Halo");
            System.out.println("2. Tampilkan Nama");
            System.out.println("3. Tampilkan Fakultas");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Halo, Selamat Datang!");
                    break;
                case 2:
                    System.out.println("Nama: Retno fika anelda");
                    break;
                case 3:
                    System.out.println("Fakultas Teknik");
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
            }
        } while (pilihan != 0);
        in.close();
    }
}
