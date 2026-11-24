package Day084;
import java.util.Scanner;
public class Day084 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("=== MENENTUKAN ANGKA MAKSIMAL ===");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            a[i] = input.nextInt();
        }
        int maksimal = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksimal) {
                maksimal = a[i];
            }
        }
        System.out.println("Angka maksimal adalah: " + maksimal);
    }
}
