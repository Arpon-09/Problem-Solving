import java.util.*;

public class D_Counting_Elements {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] array = new int[n];

        // input 

        for (int i=0; i<n; i++) {
            array [i] = sc.nextInt();
        }

        // main logic 

        int count = 0;  //count = 3

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (array[i] + 1 == array[j]) {
                    count++;
                    break;
                }
            }
        } System.out.println(count);


    }
}