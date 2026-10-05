package Day034;
import java.util.Scanner;
public class Day034 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();
        if (umur < 13) {
            System.out.println("Kategori: Anak-anak");
        } else if (umur < 18) {
            System.out.println("Kategori: Remaja");
        } else if (umur < 60) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia");
        }
    }
}
