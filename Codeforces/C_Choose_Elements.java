import java.util.*;

public class C_Choose_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long sum = 0;
        int count = 0;

        for (int i = n - 1; i >= 0 && count < k; i--) {
            if (arr[i] <= 0) break;
            sum += arr[i];
            count++;
        }

        System.out.println(sum);
    }
}
