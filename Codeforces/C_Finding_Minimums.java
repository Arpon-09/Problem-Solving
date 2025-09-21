import java.util.*;

public class C_Finding_Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int k = sc.nextInt();  

        int[] a = new int[n];  

        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

       
        for (int i = 0; i < a.length; i += k ) {
            int min = a[i];  

            for (int j = i; j < i + k && j < a.length;  j++) {
                if (a[j] < min) {
                    min = a[j];
                }
            }

            System.out.print(min + " " );
        }
    }
}
