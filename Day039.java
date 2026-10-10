package Day039;
import java.util.Scanner;
public class Day039 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Perhitungan (contoh 3+4) :");
        double a = in.nextDouble();
        char operator = in.next().charAt(0);
        double b = in.nextDouble();

        if (operator == '+') {
            System.out.println("Hasil: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Hasil: " + (a / b));
            } else {
                System.out.println("Tidak bisa dibagi nol!");
            }
        } else {
            System.out.println("Operator tidak valid!");
        }
    }
}
