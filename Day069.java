package Day069;
import java.util.Scanner;
public class Day069 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
