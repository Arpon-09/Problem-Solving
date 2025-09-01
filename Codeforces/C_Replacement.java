import java.util.*;
public class C_Replacement{
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        // input x == ?
        int x = sc.nextInt();
        // declear the array

        int [] num = new int[x];

        for (int i=0; i<x; i++) {
            num [i] = sc.nextInt();
        }
        // read the array

        for (int j=0; j<num.length; j++) {
            if (num [j]<0) {
                num [j] = 2;
            } else if (num [j]>0) {
                num [j] = 1;
            }
        } 

        for (int j=0; j<num.length; j++) {
            System.out.print(num[j] + " ");
        }
    } 
}