package Day074;
import java.util.Scanner;
public class Day074 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = in.nextLine();
        System.out.println("Judul huruf kapital: " + judul.toUpperCase());
        System.out.println("Judul huruf kecil: " + judul.toLowerCase());
        int jumlahKarakter = judul.length();
        System.out.println("Jumlah karakter: " + jumlahKarakter);
        if (jumlahKarakter > 20) {
            System.out.println("Judul buku cukup panjang");
        } else {
            System.out.println("Judul buku tidak terlalu panjang");
        }
        in.close();
    }
}
