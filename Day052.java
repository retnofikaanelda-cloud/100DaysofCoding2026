package Day052;
import java.util.Scanner;
public class Day052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pin = 0;

        while (pin != 5421) {
            System.out.print("Masukkan PIN: ");
            pin = in.nextInt();
        }
        System.out.println("PIN benar, berhasil masuk!");

        in.close();
    }
}
