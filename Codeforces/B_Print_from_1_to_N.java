import java.util.*;
public class B_Print_from_1_to_N {
    public static void count (int m ,int n) {
        System.out.println(m);
        if (m == n) {
            return;
        }
       
        count(m+1, n);
        
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = 1;
        count(m, n);
    }
}