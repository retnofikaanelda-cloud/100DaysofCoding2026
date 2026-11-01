package Day061;
import java.util.Scanner;
public class Day061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = in.nextInt();

        int jumlah =1;
        for (int i = 1; i <= n; i++) {
            jumlah *=  i ;{
            }
        }
                System.out.println("Hasil Perkalian angka (1-N) = "+ jumlah);
    }
}
