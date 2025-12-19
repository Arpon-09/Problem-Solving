import java.util.Scanner;

public class J_Count_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[26]; // a-z

       for (int i=0; i<s.length(); i++) {
        char c = s.charAt(i);
        freq[c - 'a']++;
       }

       for (int i = 0; i<freq.length; i++) {
        if (freq[i] > 0) {
            char latter = (char) (i + 'a');
             System.out.println(latter + " : " + freq[i]);
        }
       }
    }
}
