import java.util.*;
public class Y_The_last_2_digits {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long sum = (a * b) % 100;
        sum = (sum * c) % 100;
        sum = (sum * d) % 100;

        System.out.printf("%02d\n", sum);



    }
}