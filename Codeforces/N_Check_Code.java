import java.util.*;
public class N_Check_Code {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        if (s.length() != n + m + 1) {
            System.out.println("No");
            return;
        }

          if (s.charAt(n) != '-') {
            System.out.println("No");
            return;
        }

        boolean v = true;

        for (int i=0; i < n; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                v = false;
                break;
            }
        }

        for (int i=n+1; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                v = false;
                break;
            }

           }

            if (v) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        
    }
}