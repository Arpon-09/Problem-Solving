import java.util.*;
public class E_Max {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for (int i = 2; i<=x-1; i++ ) {
            if (x % 1 == 0 && x % i != 0 && x % x == 0 ) {
                System.out.println("YES");
                return;
            } else {
                System.out.println("NO");
                return;
            }
        }
       
    }
}