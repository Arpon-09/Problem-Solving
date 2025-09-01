import java.util.*;
public class F_Reversing {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int [] num = new int [x];

        for(int i=0; i<x; i++) {
            num[i] = sc.nextInt();
        } 

        for (int j=num.length-1; j>=0; j--){
            System.out.print(num[j] + " ");
        }
    }
}