import java.util.*;
public class E_Alternating_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        //input

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // logic 
        
        int firstCount = 0;
        int secondCount = 0;

        for (int i=0; i<n; i++) {
            if (i % 2 == 0 && arr[i]<0) firstCount ++;
            if (i % 2 == 1 && arr[i]>0) firstCount ++;

            if (i % 2 == 0 && arr[i]>0) secondCount ++;
            if (i % 2 == 1 && arr[i]<0) secondCount ++;

        }
        System.out.println(firstCount);
        System.err.println(secondCount);
        System.out.println(Math.min(firstCount, secondCount));
        

    }
}