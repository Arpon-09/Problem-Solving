import java.util.Scanner;

public class H_N_Times {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-->0) {
            int n = sc.nextInt();
            String s = sc.next();

            cal(n, s);
            
        }
    }
     public static void cal (int n, String s) {

        for (int i =0; i<n; i++) {
            System.out.print(s + ' ');
        } System.out.println();
    }
}