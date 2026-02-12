import java.util.Scanner;

public class problem6 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(s);

        String [] words = s.trim().split("\\s+");
        StringBuilder reverse = new StringBuilder();


        for (int i=words.length-1; i>=0; i--) {
           
            reverse.append(words[i] + " ");

        }
        System.out.println(reverse);
    }
}
