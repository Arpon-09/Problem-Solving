import java.util.*;
public class A_Print_Recursion {

    public static void cou(String str, int n) {
        if (n == 0) {
            return;
        }

        System.out.println(str);
        cou(str, n-1);
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "I love Recursion";
        cou(str, n);


    }
}