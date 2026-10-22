package Day051;
import java.util.Scanner;

public class Day051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka batas: ");
        int batas = in.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println(i);
        }

        in.close();
    }
}
