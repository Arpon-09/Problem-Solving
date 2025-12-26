import java.util.Scanner;

public class G_Max_and_MIN {
    static void calMaxMin (long[] arr) {

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] num = new long[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextLong();
        }
        calMaxMin(num);
    }
}
