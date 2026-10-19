package Day048;
import java.util.Scanner;
public class Day048 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = in.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = in.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = in.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;

            case '-':
                System.out.println("Hasil: " + (a - b));
                break;

            case '*':
                System.out.println("Hasil: " + (a * b));
                break;

            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
        }

        in.close();
    }
}
