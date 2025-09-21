import java.util.*;
public class A_Add {
    public static int sum (int a, int b) {
        int summ = a + b;
        return summ;
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = sum(a, b);
        System.out.println(result);

    }
}