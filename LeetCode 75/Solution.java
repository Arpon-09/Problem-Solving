import java.util.*;

public class Solution {
    public String mergeAlternately(String a, String b) {
        int i = 0, j = 0;
        StringBuilder result = new StringBuilder();

        while (i < a.length() || j < b.length()) {
            if (i < a.length()) {
                result.append(a.charAt(i));
                i++;
            }
            if (j < b.length()) {
                result.append(b.charAt(j));
                j++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        Solution sol = new Solution();
        System.out.println(sol.mergeAlternately(a, b));
    }
}
