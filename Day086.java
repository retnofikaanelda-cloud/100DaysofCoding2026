package Day086;
import java.util.Scanner;
public class Day086 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("=== MENCARI ELEMEN ARRAY ===");
        System.out.print("Masukkan angka yang dicari: ");
        int cari = in.nextInt();
        boolean ditemukan = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == cari) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan!");
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan!");
        }
    }
}
