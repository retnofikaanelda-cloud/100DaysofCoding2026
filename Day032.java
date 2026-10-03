package Day032;
public class Day032 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int hasil = (a + b) * 2;
        boolean perbandingan = hasil > 20;
        boolean logika = (a > b) && (hasil > 20);
        System.out.println("Nilai a                 = " + a);
        System.out.println("Nilai b                 = " + b);
        System.out.println("Hasil (a + b) * 2       = " + hasil);
        System.out.println("Hasil > 20              = " + perbandingan);
        System.out.println("(a > b) && (hasil > 20) = " + logika);
    }
}
