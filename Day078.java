package Day078;
import java.util.Scanner;
public class Day078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== BUAT AKUN ===");
        System.out.print("Buat Username: ");
        String username = in.nextLine();
        System.out.print("Buat Password: ");
        String password = in.nextLine();
        System.out.println("\nAkun berhasil dibuat!");
        System.out.println("\n=== LOGIN AKUN ===");
        String user;
        String pass;
        do {
            System.out.print("Masukkan Username: ");
            user = in.nextLine();

            System.out.print("Masukkan Password: ");
            pass = in.nextLine();
        if (!user.equals(username) || !pass.equals(password)) {
                System.out.println("Username / Password salah!");
                System.out.println("Silakan coba lagi.\n");
            }
        } while (!user.equals(username) || !pass.equals(password));
        System.out.println("\nLogin berhasil!");
        System.out.println("Selamat datang, " + username);
        in.close();
    }
}
