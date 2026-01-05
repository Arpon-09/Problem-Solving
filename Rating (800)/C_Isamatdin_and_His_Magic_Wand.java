import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C_Isamatdin_and_His_Magic_Wand {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T -->0) {
            int n = sc.nextInt();

            int arr[] = new int[n];
            int even[] = new int[n];
            int odd [] = new int[n];

            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }


            for (int i=0; i<n; i++) {
                if (arr[i]%2 !=0 ) {
                    odd[i] = arr[i];
                } else if (arr[i]%2 ==0) {
                    even[i] = arr[i];
                }
            } 

            if (Arrays.equals(arr, odd)) {
                for (int i=0; i<odd.length; i++) {
                System.out.print(odd[i] + " ");
            }
            System.out.println();
            } else if (Arrays.equals(arr, even)) {
                for (int i=0; i<even.length; i++) {
                    System.out.print(even[i] + " ");
                }
                System.out.println();
            } 
            else {
                Arrays.sort(arr);
                for (int i=0; i<arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            
        }
    }
}