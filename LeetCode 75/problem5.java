import java.util.*;
public class problem5 {
    public static void main (String [] args) {
      

        String str = "IceCreAm";
        String onlyVowel = "";
        String newStr = "";


        for (int i=str.length()-1; i>=0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                onlyVowel = onlyVowel + str.charAt(i);
            }
        }
        
        char [] arr = str.toCharArray();
        int voweIndex = 0;

        for (int i=0; i<arr.length; i++) {
            char ch = Character.toLowerCase(arr[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                arr[i] = onlyVowel.charAt(voweIndex);
                voweIndex ++;
            }
        }

        newStr = new String(arr);
        System.out.println(newStr);

    }
}
