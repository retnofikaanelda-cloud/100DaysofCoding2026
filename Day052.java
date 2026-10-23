package Day052;
import java.util.Scanner;
public class Day052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka batas: ");
        int batas = input.nextInt();
        int angka = 1;
        while (angka <= batas) {
            System.out.println("Angka: " + angka);
            angka++;
        }
        input.close();
    }
}
