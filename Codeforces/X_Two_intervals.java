import java.util.*;
public class X_Two_intervals {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (b > c) {
            System.out.println(c + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } 
        else {
            System.out.println(-1);
        }
    }
}