package Day011;
import java.util.Scanner;
public class Day011 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("\nHalo, " + nama);
        System.out.println("Umur kamu " + umur + " tahun.");
    }
}
