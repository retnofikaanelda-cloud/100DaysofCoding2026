package Day046;
import java.util.Scanner;
public class Day046 {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      
        System.out.println("=== MENU BAKSO ===");
        System.out.println("1. Bakso Biasa - Rp 12.000");
        System.out.println("2. Bakso Urat  - Rp 15.000");
        System.out.println("3. Bakso Telur - Rp 17.000");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Bakso Biasa, harga Rp 12.000");
                break;
            case 2:
                System.out.println("Anda memesan Bakso Urat, harga Rp 15.000");
                break;
            case 3:
                System.out.println("Anda memesan Bakso Telur, harga Rp 17.000");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
        in.close();
    }
}

