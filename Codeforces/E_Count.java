import java.util.*;
public class E_Count {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
    
        for (int j=0; j<str.length(); j++) {
            char ch = str.charAt(j);
            int num = Character.getNumericValue(ch);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}