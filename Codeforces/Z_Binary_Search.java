import java.lang.reflect.Array;
import java.util.*;
public class Z_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr [] = new int[N];

        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        for (int i=0; i<M; i++) {
            
            int k = sc.nextInt();

            int result = binarySearch(arr, k);

            if (result == -1) {
            System.out.println("not found");
        }  else {
            System.out.println("found");
        }
        } 
    }
    public static int binarySearch (int []array, int target) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int mid = left + (right -left)/2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }

        }  return -1;
    }
}