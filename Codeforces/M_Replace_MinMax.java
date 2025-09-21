import java.util.*;
public class M_Replace_MinMax {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int x =0;
        int b =0;

        int arr [] = new int[s];

        for (int i=0; i<s; i++) {
            arr [i] = sc.nextInt();

            if (arr[i] < min) {
                min = arr[i];
                x = i;
            } if (arr[i] > max) {
                max = arr[i];
                b = i;
            }
        } 

        for (int i=0; i<s; i++) {
            if (s != 0) {
                arr[x] = max;
                arr[b] = min;

                System.out.print(arr[i] + " ");
            }
        }
    }
}