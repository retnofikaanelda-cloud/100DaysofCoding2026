package Day087;
import java.util.Scanner;
public class Day087 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Data sebelum diubah:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        a[2] = 100;
        System.out.println("\nData setelah diubah:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
