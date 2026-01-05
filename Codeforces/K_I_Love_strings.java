import java.util.Scanner;

public class K_I_Love_strings {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

       

        while (T --> 0) {


        String word1 = sc.next();
        String word2 = sc.next();

        StringBuilder finalWord = new StringBuilder();

        int minLen = Math.min (word1.length(), word2.length());


            for (int i=0; i<minLen; i++) {
            finalWord.append(word1.charAt(i));
            finalWord.append(word2.charAt(i));

        }
        
        if (minLen < word1.length()) {
            finalWord.append(word1.substring(minLen));
        } else if (minLen < word2.length()) {
            finalWord.append(word2.substring(minLen));
        }

        System.out.println(finalWord);

    }


       
    }
}
