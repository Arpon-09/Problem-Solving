import java.util.*;

public class E_Interval_Sweep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // odd co
int b = sc.nextInt();

int total = a + b;

if (total == 0) {
    System.out.println("NO");
} else if (total % 2 == 0) {
    // total even -> odd count must equal even count
    if (a == b) System.out.println("YES");
    else System.out.println("NO");
} else {
    // total odd -> odd and even counts differ by 1
    if (Math.abs(a - b) == 1) System.out.println("YES");
    else System.out.println("NO");
}

    }
}
