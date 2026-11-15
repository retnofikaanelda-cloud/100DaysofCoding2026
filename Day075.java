package Day075;
import java.util.Scanner;
public class Day075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = in.nextLine();
        System.out.print("Masukkan password: ");
        String password = in.nextLine();
        System.out.print("Masukkan program studi: ");
        String prodi = in.nextLine();
        if (username.isEmpty()) {
            System.out.println("Username wajib diisi");
        }
        if (password.equals("Java123")) {
            System.out.println("Password benar");
        }
        if (prodi.equalsIgnoreCase("informatika")) {
            System.out.println("Program studi sesuai");
        }
        if (prodi.contains("Teknik")) {
            System.out.println("Berada di Fakultas Teknik");
        }
        if (!username.isEmpty() && password.equals("Java123")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal");
        }
        in.close();
    }
    }
