package Day058;
import java.util.Scanner;
public class Day058 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        System.out.println("Angka ganjil:");
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAngka genap:");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
