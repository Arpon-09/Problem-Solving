import java.util.*;
public class K_Sum_Digits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        String s = sc.next();

        int sum = 0;

        int arr [] = new int[N];

        for (int i=0; i < N; i++) {

            arr[i] = s.charAt(i) - '0';

            sum = sum + arr[i];
        }
        


        System.out.println(sum);
        




    }
}