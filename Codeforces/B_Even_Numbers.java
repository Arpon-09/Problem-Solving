import java.util.*;
public class B_Even_Numbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();



        if (num == 1) {
            System.out.println(-1);
        }
        for (int i = 2; i <= num ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    } 
}