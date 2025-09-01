import java.util.*;
public class H_Sorting {
    // custom mathod

    // public static void shortA (int [] num) {
    //     for (int i=0; i<num.length; i++) {
    //         System.out.print(num[i] + " ");
    //     }
    // }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        // declear a num
        int x = sc.nextInt();

        int [] num = new int[x];
        
        //input the array of x num

        for (int i=0; i<x; i++) {
            num[i] = sc.nextInt();
        }
        
        for(int i=0; i<num.length-1; i++) {
            for (int j=0; j<num.length-i-1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        } for (int i=0; i< num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}