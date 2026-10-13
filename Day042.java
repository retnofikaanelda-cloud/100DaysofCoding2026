package Day042;
import java.util.Scanner;
public class Day042 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = in.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = in.nextDouble();

        if (potongan > gajiPokok) {
            System.out.println("Potongan tidak boleh melebihi gaji pokok");
        } else {
            double gajiBersih = gajiPokok - potongan;
            System.out.println("Gaji bersih: Rp" + gajiBersih);
        }

        in.close();
    }
}
