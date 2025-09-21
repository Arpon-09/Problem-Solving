import java.util.*;

public class U_Float_or_int {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.contains(".")) {
            String [] parts = str.split("\\.");
            String intPart = parts[0];
            String decPart = parts[1];

            if(Integer.parseInt(decPart)==0) {
                System.out.println("int " + intPart);
            } else {
                System.out.println("float " + intPart + " 0." + decPart);
            } 
        } else {
            System.out.println(str);
        }
    }
}