import java.util.Scanner;

public class G_Even_Hate_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int even = 0;
            int odd = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if (n % 2 != 0) {
                System.out.println(-1);
            } else {
                int ans = Math.abs(even - odd) / 2;
                System.out.println(ans);
            }
        }
    }
}
