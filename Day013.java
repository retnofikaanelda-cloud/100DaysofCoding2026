package Day013;
import java.util.Scanner;
public class Day013 {
    public static void main(String[] args) {
        System.out.println("SOAL 1");
        System.out.println("nama \tjurusan");
        System.out.println("sela \tinformatika");
        System.out.println("meli \tinformatika");
        
        System.out.println("\nSOAL 2");
        int st = 20;
        float hr = 25.500f;
        double bb = 3.5f;
        
        System.out.println("Jumlah Stok   = "+ st);
        System.out.println("Harga Barang  = "+ hr +"00");
        System.out.printf("Berat Barang  = %.1f kg%n ",3.5);
        
   
        System.out.println("\nSOAL 3");
        System.out.printf("===INFORMASI MAHASISWA===");
        System.out.printf("\nNama        \t: %s " ,"Dwi");
        System.out.printf("\nNIM         \t: %s","D0225330");
        System.out.printf("\numur        \t: %d ",19);
        System.out.printf("\nipk         \t: %.2f ",3.89);
        System.out.printf("\n\bJenis kelamin \t: %s","p");
        
        System.out.println("\n\nSOAL 4");
        int sd = 25000;
        int m =20000;
        System.out.println("saldo awal  :"+sd);
        System.out.println("saldo masuk :"+m);
        sd =45000;
        System.out.println("saldo akhir :"+sd);
        
        System.out.println("\nSOAL 5");
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama pemesan : ");
        String n = in.nextLine();
        System.out.print("Masukkan nama makanan : ");
        String mkn = in.nextLine();
        System.out.print("Masukkan jumlah       : ");
        int j = in.nextInt();
        System.out.print("kode pesanan          : ");
        char kp = in.next().charAt(0);
        
        System.out.println("===DATA PESANAN===");
        System.out.println("Nama pemesan   :"+n);
        System.out.println("Makanan        :"+mkn);
        System.out.println("Jumlah pesanan :"+j);
        System.out.println("kode pesanan   :"+kp);
        
    }
    
}
