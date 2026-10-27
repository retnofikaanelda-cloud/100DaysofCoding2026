package Day056;
import java.util.Scanner;
public class Day056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        System.out.println("Angka 1 - N:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nAngka N - 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        in.close();
    }
}
