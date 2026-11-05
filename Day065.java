package Day065;
import java.util.Scanner;
public class Day065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi garis: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        in.close();
    }
}
