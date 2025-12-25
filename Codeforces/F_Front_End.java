import java.util.*;
public class F_Front_End {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = n;
        int arr [] = new int[n];
        int arrr[] = new int[n];


        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int idx = 0;

        while (left <= right) {
            if (idx % 2 == 0) {
                arrr[idx] = arr[left];
                left ++;
            } else {
                arrr[idx] = arr[right];
                right --;
            } idx ++;
        }

        for (int i=0; i<arrr.length; i++) {
            System.out.print(arrr[i] + " ");
        }
    } 
}