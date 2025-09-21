import java.util.*;
public class B_Let_s_use_Getline {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        String str = sc.nextLine();

        String[] word = str.split("\\\\");

        String result = "";

        if(word.length > 0) {
            result = word[0].trim();
        }

        System.out.println(result);

    }
}