package Day077;
public class Day077 {
    public static void main(String[] args) {
        String nama = "  Retno Fika Anelda  ";
        System.out.println("Panjang teks: " + nama.length());
        System.out.println("Trim: " + nama.trim());
        System.out.println("Uppercase: " + nama.toUpperCase());
        System.out.println("Lowercase: " + nama.toLowerCase());
        System.out.println("Karakter pertama: " + nama.trim().charAt(0));
        System.out.println("Replace: " + nama.replace("Fika", "Putri"));
        System.out.println("Contains: " + nama.contains("Fika"));
        System.out.println("Equals: " + nama.trim().equals("Retno Fika Anelda"));
        System.out.println("Substring: " + nama.trim().substring(0, 5));
    }
}
