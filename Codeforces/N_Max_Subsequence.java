import java.util.Scanner;

// public class N_Max_Subsequence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         String s = sc.next(); 

//         int k = 1;
//         char c = s.charAt(0);

//         for (int i=1; i<n; i++) {
//             if (s.charAt(i) != c) {
//                 k++;
//                 c = s.charAt(i);
//             }
//         }
//          System.out.println(k);
//     }
// }


public class N_Max_Subsequence {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.next();

        int count = 1;

        char c = str.charAt(0);

        for (int i=1; i<n; i++) {
            if (str.charAt(i) != c) {
                count ++;
                c = str.charAt(i);
            }
        } System.out.println(n-count);
    }
}