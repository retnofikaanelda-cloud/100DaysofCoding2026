package Day045;
import java.util.Scanner;
public class Day045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka (1-3): ");
        int angka = input.nextInt();
        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
