package Day062;
import java.util.Scanner;
public class Day062 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa (M): ");
        int m = in.nextInt();

        System.out.print("Masukkan jumlah laporan per mahasiswa (N): ");
        int n = in.nextInt();

        System.out.println("\n--- DAFTAR TUGAS MAHASISWA ---");

        for (int i = 1; i <= m; i++) {
            System.out.println("Mahasiswa ke-" + i + ":");

            for (int j = 1; j <= n; j++) {
                System.out.println("   - Laporan " + j);
            }
            System.out.println();
        }
        in.close();
    }
}
