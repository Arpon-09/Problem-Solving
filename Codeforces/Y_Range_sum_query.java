import java.util.*;


public class Y_Range_sum_query {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        

        int arr[] = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        
        long prefix [] = new long[N];

        if (N > 0) {
            prefix [0] = arr[0];

            for (int i=1; i<N; i++) {
                prefix [i] = prefix[i-1] + arr[i];
            }            


        }

        

        for (int i=0; i<M; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;

            long sum;

            if (start == 0 ) {
                sum = prefix[end];
            }
            else {
                sum = prefix[end] - prefix[start-1];
            }
            System.out.println(sum);

           
            
        }
         
    }
}
