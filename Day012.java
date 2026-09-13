package Day012;
import java.util.Scanner;
public class Day012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKKAN BIOADATA : ");
        
        System.out.print("Masukkan Nama = ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM = ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Alamat = ");
        String alamat = input.nextLine();

        System.out.print("Masukkan PRODI = ");
        String prodi = input.nextLine();
        
        System.out.print("Masukkan Umur = ");
        int umur = input.nextInt();
        
        System.out.println("\n---BIODATA MAHASISWA---");
        System.out.println("NAMA   : "+ nama);
        System.out.println("NIM    : "+ nim);
        System.out.println("Umur   : "+ umur + " Tahun");
        System.out.println("Alamat : "+ alamat);
        System.out.println("PRODI  : "+ prodi);
    }
    
}
