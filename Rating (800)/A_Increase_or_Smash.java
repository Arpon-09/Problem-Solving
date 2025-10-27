import java.util.*;
public class A_Increase_or_Smash {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int arryLength = sc.nextInt();
            int arr [] = new int[arryLength];
            int count = 1;

            for (int i=0; i<arryLength; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            for (int i=1; i<arr.length; i++) {
                if (arr[i] != arr[i-1]) {
                    count ++;
                    
                }
            } int sum = (2 * count)-1;
                System.out.println(sum);
        }
    }
}