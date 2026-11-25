package Day085;
import java.util.Scanner;
public class Day085 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Angka terkecil adalah: " + min);
    }
}
