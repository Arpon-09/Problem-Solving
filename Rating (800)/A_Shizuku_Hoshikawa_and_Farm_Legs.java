import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            System.out.println((n % 2 == 1) ? 0 : (n / 4 + 1));
        }
        sc.close();
    }
    
}