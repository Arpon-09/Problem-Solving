import java.util.*;

public class D_Ali_Baba_and_Puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        // Check all possible combinations where each operator is used exactly once
        // Case 1: (a op1 b) op2 c
        if ((a + b) + c == d || (a + b) - c == d || (a + b) * c == d ||
            (a - b) + c == d || (a - b) - c == d || (a - b) * c == d ||
            (a * b) + c == d || (a * b) - c == d || (a * b) * c == d) {
            System.out.println("YES");
        }
        // Case 2: a op1 (b op2 c)
        else if (a + (b + c) == d || a + (b - c) == d || a + (b * c) == d ||
                 a - (b + c) == d || a - (b - c) == d || a - (b * c) == d ||
                 a * (b + c) == d || a * (b - c) == d || a * (b * c) == d) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}