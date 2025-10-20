import java.util.*;
public class I_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int l = str.length();

        for (int i=l-1; i>=0; i--) {
            char c = str.charAt(i);
            result.append(c);
        }
       System.out.println(str.equals(result.toString()) ? "YES" : "NO");


    }
}