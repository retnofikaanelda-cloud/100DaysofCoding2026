public class Day083 {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
        }
        System.out.println("Jumlah seluruh elemen array: " + total);
    }
}
