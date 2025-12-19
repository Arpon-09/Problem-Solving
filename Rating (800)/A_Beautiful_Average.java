import java.util.*;

public class A_Beautiful_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase = sc.nextInt();

        while (testCase-- > 0) {
            int num = sc.nextInt();
            int arr[] = new int[num];
            int sum = 0;
            int ans = 0;
            
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }

           
            int max = 0;

            for (int i=0; i< num; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            

            int count = 0;
            for (int i = 0; i < num; i++) {
               if (arr[i] == max){
                count ++;
               }
            }
            for (int i=0; i <count; i++) {
                sum = sum + max;
            }
            ans = sum / count;
                System.out.println(ans);

            
        }

        sc.close();
    }
}
