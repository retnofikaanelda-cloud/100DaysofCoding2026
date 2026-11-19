package Day079;
import java.util.Scanner;
public class Day079 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0;
        double rataRata;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
        }
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        rataRata = (double) total / nilai.length;
        System.out.println("\n=== HASIL NILAI ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mata kuliah ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}
