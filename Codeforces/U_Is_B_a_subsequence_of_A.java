import java.util.*;
public class U_Is_B_a_subsequence_of_A {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int arra [] = new int[a];
        int arrb [] = new int[b];

        for (int i=0; i<a; i++) {
            arra [i] = sc.nextInt();
        }

        for (int i=0; i<b; i++) {
            arrb [i] = sc.nextInt();
        }

        int min = -1;
        boolean set = true;

        for (int i=0; i<b; i++) {
            boolean found = false;
            for (int j=min+1; j<a; j++) {
                if (arrb[i] == arra[j]) {
                    min = j;
                    found = true;
                    break;
                }
            }

            if (!found) {
                set = false;
                break;
            }
           
        } if (set) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}