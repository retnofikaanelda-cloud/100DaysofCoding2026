package Day020;
public class Day020 {
    public static void main(String[] args) {

        int umur = 19;
        double tB= 155.5;
        char jenisKelamin = 'P';
        boolean mahasiswa = true;

        String hasilUmur = String.valueOf(umur);
        String hasilTinggi = String.valueOf(tB);
        String hasilJenisKelamin = String.valueOf(jenisKelamin);
        String hasilMahasiswa = String.valueOf(mahasiswa);

        System.out.println("Umur          = " + hasilUmur);
        System.out.println("Tinggi        = " + hasilTinggi);
        System.out.println("Jenis Kelamin = " + hasilJenisKelamin);
        System.out.println("Mahasiswa     = " + hasilMahasiswa);
    }
}
