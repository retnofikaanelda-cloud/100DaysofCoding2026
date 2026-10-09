package Day038;
import java.util.Scanner;
public class Day038 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bakso");
        System.out.println("3. Mie Ayam");

        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih Bakso");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Mie Ayam");
        } else {
            System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}
