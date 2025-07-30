import java.util.*;
public class N_Numbers_Histogram {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        // all lines input 

        char S = sc.next().charAt(0);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int nums = sc.nextInt();

            // printing symbol

            for (int j = 1; j<= nums; j++) {
                System.out.print(S);
            }
            System.out.println();
        }


    } 
}
