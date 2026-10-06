package Day035;
import java.util.Scanner;
public class Day035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();
        if (umur >= 17) {
            System.out.print("Apakah memiliki KTP? (1 = Ya, 0 = Tidak): ");
            int ktp = in.nextInt();
            if (ktp == 1) {
                System.out.println("Boleh membuat akun.");
            } else {
                System.out.println("Belum bisa membuat akun.");
            }
        } else {
            System.out.println("Umur belum cukup.");
        }
    }
}
