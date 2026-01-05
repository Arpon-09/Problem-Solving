import java.util.Arrays;
import java.util.Scanner;

public class L_String_Functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        StringBuilder s = new StringBuilder(sc.next());

        while (q-- > 0) {
            String str = sc.next();

            if (str.equals("pop_back")) {
                s.deleteCharAt(s.length() - 1);
            } else if (str.equals("front")) {
                System.out.println(s.charAt(0));
            } else if (str.equals("back")) {
                System.out.println(s.charAt(s.length() - 1));
            } else if (str.equals("sort")) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;

                char[] arr = s.substring(l, r + 1).toCharArray();
                Arrays.sort(arr);
                s.replace(l, r + 1, new String(arr));  // <-- FIXED HERE

            } else if (str.equals("reverse")) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;

                StringBuilder temp = new StringBuilder(s.substring(l, r + 1));
                temp.reverse();
                s.replace(l, r + 1, temp.toString());
            } else if (str.equals("print")) {
                int pos = sc.nextInt() - 1;
                System.out.println(s.charAt(pos));
            } else if (str.equals("substr")) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                System.out.println(s.substring(l, r + 1));
            } else if (str.equals("push_back")) {
                char x = sc.next().charAt(0);
                s.append(x);
            }
        }

        sc.close();
    }
}
