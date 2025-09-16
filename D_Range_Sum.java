import java.util.*;

public class D_Range_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of pairs

        for (int i = 0; i < n; i++) {
            long start = sc.nextLong();
            long end = sc.nextLong();

            // sum from start to end using formula
            long sum = (start + end) * (end - start + 1) / 2;

            System.out.println(sum); // print sum of this pair
        }
    }
}
