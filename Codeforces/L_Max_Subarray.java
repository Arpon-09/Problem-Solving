import java.util.*;

public class L_Max_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        
        while (T-- > 0) {
            int S = sc.nextInt();
            int arr[] = new int[S];

            for (int i = 0; i < S; i++) {
                arr[i] = sc.nextInt();
            }

            
            for (int i = 0; i < S; i++) {
                int max = arr[i]; 
                for (int j = i; j < S; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                    }
                    System.out.print(max + " ");
                }
            }
            System.out.println();
        }
    }
}
