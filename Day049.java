package Day049;
import java.util.Scanner;
public class Day049 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka: " + angka);
        System.out.println("Hasil: " + hasil);
    }
}
