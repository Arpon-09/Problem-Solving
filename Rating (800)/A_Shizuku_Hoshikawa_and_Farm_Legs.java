import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T--> 0) {
            int n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println("0");
            } else if (n == 2) {
                System.out.println("1");
            } else if (n == 4) {
                System.out.println("2");
            } else if (n==6) {
                System.out.println("2");
            } else  {
                int sum = n / 4;
                int summ = sum + 1;
                System.out.println(summ );
            } 
        }
    }
    
}