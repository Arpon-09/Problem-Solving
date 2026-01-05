import java.util.Scanner;

public class M_Subsequence_String {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String target = "hello";
        int j = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == target.charAt(j)) {
                j++;

                if (j == target.length()) {
                    break;
                }
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}