package Day053; 
import java.util.*;
public class Day053{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int tabungan, total = 0, pilihan;
        do {
            System.out.print("Masukkan tabungan: Rp ");
            tabungan = in.nextInt();
            total += tabungan;

            System.out.print("Menabung lagi? (1=Ya, 0=Tidak): ");
            pilihan = in.nextInt();
        } while (pilihan == 1);

        System.out.println("Total tabungan: Rp " + total);
    }
    }

