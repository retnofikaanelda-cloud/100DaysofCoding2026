package Day076;
import java.util.Scanner;
public class Day076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode mahasiswa: ");
      
        String kode = sc.nextLine();
        String kodeBersih = kode.trim();
        String kodeGanti = kodeBersih.replace("-", "/");
        String kodePotong = kodeGanti.substring(0, 9);

        System.out.println("\n=== HASIL PENGOLAHAN KODE ===");
        System.out.println("Kode awal       : " + kode);
        System.out.println("Setelah trim    : " + kodeBersih);
        System.out.println("Setelah replace : " + kodeGanti);
        System.out.println("Setelah substring: " + kodePotong);

        sc.close();
    }
}
