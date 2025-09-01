import java.util.*;
public class B_Searching {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean found = false;

        int Array [] = new int[n];

        for (int i=0; i<n; i++) {
            Array[i] = sc.nextInt();
        } 

        int x = sc.nextInt();

        for (int j=0; j<Array.length; j++) {
            if (Array[j] == x) {
            System.out.println(j);
            found = true;
            break;
            }
        } if (!found)  {
        System.out.println("-1");
        }
    }
}