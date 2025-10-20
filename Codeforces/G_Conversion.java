import java.util.*;
public class G_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String input = str.replace(",", " ");

        StringBuilder result = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        } System.out.println(result);
    }
}