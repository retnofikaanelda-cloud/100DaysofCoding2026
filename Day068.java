package Day068;
import java.util.Scanner;
public class Day068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = in.nextInt();

        System.out.println("Bilangan ganjil dari " + n + " sampai 1:");

        for (int i = n; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan genap dari " + n + " sampai 1:");

        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
