package Day066;
import java.util.Scanner;
public class Day066 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan panjang garis: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        in.close();
    }
}
