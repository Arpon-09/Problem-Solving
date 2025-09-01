import java.util.*;
public class E_Lowest_Number {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int mini = Integer.MAX_VALUE;
        int minidx = 1;

        int [] num = new int [x];


        for (int i=0; i<x; i++) {
            num [i] = sc.nextInt();
        }

        for (int j=0; j<num.length; j++) {
            if (num[j]<mini) {
                mini = num[j];
                minidx = j+1;
            }
        } System.out.print(mini + " ");
        System.out.println(minidx);
    }
}