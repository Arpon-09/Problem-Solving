import java.util.*;
public class W_Shape_3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a -i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int k = a - i; k >= 1; k--) {
                System.out.print(" ");
            }

            for (int j = i*2-1; j >= 1; j--) {
                System.out.print("*");
            } System.out.println();
        }
    }
}