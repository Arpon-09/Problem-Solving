import java.util.*;
public class G_Palindrome_Array {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isPelindroma = true;

        int [] num = new int [x];

        for(int i=0; i<x; i++) {
            num [i] = sc.nextInt();
        }

        for (int j=0; j< x/2; j++) {
            if (num[j] != num[x-1-j]) {
                isPelindroma = false;
                break;
            }
        }
        if (isPelindroma) {
            System.out.println=("YES");
        } else {
            System.out.println("NO");
        }
    }
}
