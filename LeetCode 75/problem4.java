import java.util.*;
public class problem4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr [] = new int [s];
        boolean flag = false;

        for (int i=0; i<s; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int n = sc.nextInt();

        for (int i=1; i<s; i++) {
            if (arr[i] == 0 && arr[i+1] == 0 && arr[i-1] == 0) {
                count++;
            }
        }
        if (count == n) {
            flag = true;
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }   
}
