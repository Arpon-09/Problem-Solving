import java.util.*;
public class problem2 {
    public static void gcdOfStrings(String str1, String str2) {

       String a = str1 + str2;
       String b = str2 + str1;

       if (a.equals(b)) {
        System.out.println("YES");
       } else {
        System.out.println("\"\"");
       }

    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        gcdOfStrings(str1, str2);
    }
    
}
