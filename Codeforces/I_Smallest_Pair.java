import java.util.*;
public class I_Smallest_Pair {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int k=0; k<T; k++) {


        int S = sc.nextInt();
        int min = Integer.MAX_VALUE;

        int arr [] = new int[S];

        for (int i=0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }

        for (int i=0; i <arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                int result = arr[i] + arr[j] + (j-i);
                if (result < min) {
                    min = result;
                }
                
            }
        }System.out.println(min);
    }
    }
}