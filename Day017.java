package Day017;
public class Day017 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 3;
        
        a = b;
        b += c;
        c -= a;
        
        System.out.println("Hasil a :" + a);
        System.out.println("Hasil b :" + b);
        System.out.println("Hasil c :" + c);
    }
}
