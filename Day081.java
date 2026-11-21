package Day081;
import java.util.Scanner;
public class Day081 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a= new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        System.out.println("\nIsi semua elemen array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Elemen indeks " + i + ": " + a[i]);
        }
    }
}

    

