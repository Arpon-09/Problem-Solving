import java.util.*;

public class B_Memo_and_Momo {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double k = sc.nextDouble();

        // double sumA = a / k;
        // double sumB = b/ k;

        if (a % k == 0 && b % k == 0) {
            System.out.println("Both");
        } else if (a % k == 0) {
            System.out.println("Memo");
        } else if (b % k == 0) {
            System.out.println("Momo");
        } else {
            System.out.println("No One");
        }
    }
}