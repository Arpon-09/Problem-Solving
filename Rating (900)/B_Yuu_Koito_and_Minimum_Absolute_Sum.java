import java.util.*;

public class B_Yuu_Koito_and_Minimum_Absolute_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        while (T-- > 0) {
            int n = sc.nextInt(); 
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            
            int first = arr[0];
            int last = arr[n - 1];

           
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] == -1) {
                    arr[i] = 0; 
                }
            }

          
            if (first == -1 && last == -1) {
                arr[0] = arr[n - 1] = 0;
            } else if (first == -1) {
                arr[0] = arr[n - 1];
            } else if (last == -1) {
                arr[n - 1] = arr[0];
            }

            int sum = Math.abs(arr[n-1] - arr[0]);

            System.out.println();

            System.out.println(sum);

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            
           
          
        }

        sc.close();
    }
}
