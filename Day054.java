package Day054;
import java.util.Scanner;
public class Day054 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        if ( y > x ){
            x++;
        }else if(y < x){
            x--;
        }
        if(z > x){
            x += 2 ;
        }else if(z < x){
            x -= 2 ;
        }
        System.out.println(x);
    }  
}
