import java.util.*;
public class F_Adding_Bits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();

       
        long rezult = a ^ b;
        System.out.println(rezult);
    }
}