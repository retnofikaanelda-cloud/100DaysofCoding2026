package Day080;
import java.util.Scanner;
public class Day080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nm = new String[5];
        for (int i = 0; i < nm.length; i++) {
            System.out.print("Masukkan nama ke-" + (i + 1) + ": ");
            nm[i] = input.nextLine();
        }
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Nama indeks 0: " + nm[0]);
        System.out.println("Nama indeks 2: " + nm[2]);
        System.out.println("Nama indeks 4: " + nm[4]);
        System.out.print("\nMasukkan indeks yang ingin diakses (0-4): ");
        int indeks = input.nextInt();
        if (indeks >= 0 && indeks < nm.length) {
            System.out.println("Nama mahasiswa: " + nm[indeks]);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }
}
