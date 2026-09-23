package Day022;
public class Day022 {
    public static void main(String[]args){
        int a = 10;
        int b = 20;

        System.out.println("Sebelum ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nSetelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
