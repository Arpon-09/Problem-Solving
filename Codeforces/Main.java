import java.util.*;
public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextInt();
        double P = sc.nextInt();

        double O = P * 100 / (100 - X);

        System.out.println(O);
    }
}