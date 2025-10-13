import java.util.*;
public class C_Compare {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.compareTo(b)<0) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}