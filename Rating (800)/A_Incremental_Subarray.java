import java.util.*;

public class A_Incremental_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[m];

            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            boolean strictlyIncreasing = true;
            for (int i = 1; i < m; i++) {
                if (a[i] - a[i - 1] != 1) {
                    strictlyIncreasing = false;
                    break;
                }
            }

            if (strictlyIncreasing) {
                System.out.println(n - a[m - 1] + 1);
            } else {
                System.out.println(1);
            }
        }

        sc.close();
    }
}
