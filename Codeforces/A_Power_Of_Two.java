import java.util.*;
public class A_Power_Of_Two {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n < 0) {
            System.out.println("NO");
            return;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}