package Day036;
import java.util.Scanner;
public class Day036 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = in.nextInt();
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
}
