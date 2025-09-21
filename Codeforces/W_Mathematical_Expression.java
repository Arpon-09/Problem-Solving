import java.util.*;
public class W_Mathematical_Expression {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        String operator = sc.next();
        int B = sc.nextInt();
        String eq = sc.next();
        int C = sc.nextInt();

        if (operator.equals("+")) {
            int sum = A + B;
            if (sum == C) {
                System.out.println("Yes");
            } else {
                System.out.println(sum);
            }
        } else if (operator.equals("-")) {
            int sum = A - B; 
            if (sum == C) {
                System.out.println("Yes");
            } else {
                System.out.println(sum);
            }
        } else if (operator.equals("*")) {
            int sum = A * B;
            if (sum == C) {
                System.out.println("Yes");
            } else {
                System.out.println();
            }
        }
        

    }
}