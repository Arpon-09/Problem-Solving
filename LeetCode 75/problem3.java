import java.util.*;
public class problem3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int arr [] = new int[n];
        boolean chk [] = new boolean[n];
        

        for(int i=0; i<n; i++) {
            arr [i] = sc.nextInt();
            chk [i] = true;
        }
          for(int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i] + e < arr[j]) {
                    chk[i] = false;
                }
            }System.out.println(chk[i]);
        }


    }
}
