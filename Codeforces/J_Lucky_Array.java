import java.util.*;
public class J_Lucky_Array {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int count = 0;

        int arr [] = new int[S];
        int min = Integer.MAX_VALUE;

        for (int i=0; i<S; i++) {
            arr[i] = sc.nextInt();
        }

        for  (int i = 0; i<S; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }

         for (int i = 0; i<arr.length; i++) {
            if (arr[i] == min) {
                count++;
            }
         }

        if (count % 2 != 0) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }

    }
}