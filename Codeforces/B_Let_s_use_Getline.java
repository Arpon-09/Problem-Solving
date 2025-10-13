import java.util.*;
public class B_Let_s_use_Getline {
    public static void main (String [] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();         

       int position = s.indexOf("\\");
       System.out.println(s.substring(0, position));

    }
}