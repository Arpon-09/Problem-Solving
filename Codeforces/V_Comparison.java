import java.util.*;

public class V_Comparison {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        if (op.equals(">")) {
            if (a > b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (op.equals("<")) {
            if (a < b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (op.equals("=")) {
            if (a == b) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }
    }
}