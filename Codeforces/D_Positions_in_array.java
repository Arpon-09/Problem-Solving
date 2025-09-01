import java.util.*;
public class D_Positions_in_array {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

       

        int [] num = new int[x];

        for (int i=0; i<x; i++) {
            num [i] = sc.nextInt();
        } 

        for (int j=0; j<num.length; j++) {
            if (num[j] <= 10) {
                System.out.println("A[" + j + "]" + " = " + num[j]);
            }
        }
    

    }
}
