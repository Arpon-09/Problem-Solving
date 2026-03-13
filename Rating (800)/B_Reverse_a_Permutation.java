import java.util.*;

public class B_Reverse_a_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of test cases
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] lst = new int [n];
            Integer[] lst2 = new Integer [n];

            for (int i = 0; i < n; i++) {
                lst[i] = sc.nextInt();
                lst2[i] = lst[i];
            }

            // Sort lst2 in descending order (reverse=True)
            Arrays.sort(lst2, Collections.reverseOrder());

            int l = 0;
            int r = 0;
            int val = 0;

            // Find the first index where the original list differs from sorted list
            for (int i = 0; i < n; i++) {
                if (lst[i] != lst2[i]) {
                    val = lst2[i];
                    l = i;
                    break;
                }
            }

            // Find the index of 'val' in the original list
            for (int i = 0; i < n; i++) {
                if (lst[i] == val) {
                    r = i;
                    break;
                }
            }

            // Construct the answer using a StringBuilder for performance
            StringBuilder ans = new StringBuilder();

            // Part 1: Elements before the first difference
            for (int i = 0; i < l; i++) {
                ans.append(lst[i]).append(" ");
            }

            // Part 2: Elements from r back to l (the reversed subsegment)
            for (int i = r; i >= l; i--) {
                ans.append(lst[i]).append(" ");
            }

            // Part 3: Remaining elements after the subsegment
            for (int i = r + 1; i < n; i++) {
                ans.append(lst[i]).append(" ");
            }

            // Print the result for the current test case
            System.out.println(ans.toString().trim());
        }
        sc.close();
    }
}