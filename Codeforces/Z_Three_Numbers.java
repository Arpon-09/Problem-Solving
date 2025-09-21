import java.util.*;
public class Z_Three_Numbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j<=k; j++) {
                int z = c - i - j;

                if (z >= 0 && z<= k) {
                    count = count + 1;
                }
            }
        } System.out.println(count);
    }
}