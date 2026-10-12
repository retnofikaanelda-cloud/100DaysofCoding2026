package Day041;
import java.util.Scanner;
public class Day041 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan suhu ruangan: ");
        int suhu = in.nextInt();
        if (suhu < 20) {
            System.out.println("Ruangan terasa dingin");
        } else if (suhu <= 28) {
            System.out.println("Ruangan terasa normal");
        } else {
            System.out.println("Ruangan terasa panas");
        }
        in.close();
    }
}
