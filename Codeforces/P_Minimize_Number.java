import java.util.*;
public class P_Minimize_Number {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr [] = new int[s];
        int minCount = Integer.MAX_VALUE;
        
        

        for(int i=0; i <s;i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i< arr.length; i++) {
            int count = 0;
           
                while (arr[i] > 0) {
                    if (arr[i] % 2 == 0) {
                        arr[i] = arr[i] / 2;
                        count++;
                    } else {
                        arr[i] = arr[i]-1;
                        count++;
                    }
                   
                }
                System.out.println(count);
                  
        }
    }
}