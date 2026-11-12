package Day072;
import java.util.Scanner;
public class Day072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();

            if (angka < 0) {
                break;
            }

            total += angka;
        }

        System.out.println("Total penjumlahan: " + total);

        input.close();
    }
}
