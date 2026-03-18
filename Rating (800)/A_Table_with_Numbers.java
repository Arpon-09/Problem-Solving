import java.util.*;

public class A_Table_with_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            int l = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int hcount = 0;
            int lcount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= h) {
                    hcount++;
                }
                if (arr[i] <= l) {
                    lcount++;
                }
            }

            if (hcount >= lcount) {
                if (hcount / 2 <= lcount) {
                    System.out.println(hcount / 2);
                } else {
                    System.out.println(lcount);
                }
            } else {
                if (lcount / 2 <= hcount) {
                    System.out.println(lcount / 2);
                } else {
                    System.out.println(hcount);
                }
            }
        }
    }
}