package Day055;
import java.util.Scanner;
public class Day055 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int nilai;

        while (true) {
            System.out.print("Masukkan nilai mahasiswa (-1 untuk berhenti): ");
            nilai = in.nextInt();
          
            if (nilai == -1) {
                break;
            } if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid!");
                continue;
            } if (nilai == 40) {
                System.out.println("Program dihentikan karena nilai 40 ditemukan!");
                return;
            }
            System.out.println("Nilai mahasiswa: " + nilai);
        }
        System.out.println("Pemeriksaan nilai selesai!");
        in.close();
    }
}
