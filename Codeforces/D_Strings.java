import java.util.*;
public class D_Strings {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + " " + b.length());
        System.out.println(a + b);
        
        char firstA = a.charAt(0);
        char firstB = b.charAt(0);

        String newA = firstB + a.substring(1);
        String newB = firstA + b.substring(1);
        System.out.println(newA + " " + newB);
    }
}