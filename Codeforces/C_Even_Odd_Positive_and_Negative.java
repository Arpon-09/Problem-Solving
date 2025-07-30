import java.util.*;
public class C_Even_Odd_Positive_and_Negative {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int first_line = sc.nextInt();
        int Even = 0;
        int odd = 0;
        int Positive = 0;
        int Negetive = 0;
        
        

        for (int i = 1; i <= first_line; i++) {
           int second_line = sc.nextInt();

           if (second_line % 2 == 0) {
            Even = Even +1; 
           }if (second_line > 0) {
            Positive = Positive +1; ;
           }
           if (second_line < 0) {
            Negetive = Negetive +1;
           } if (second_line % 2 != 0) {
            odd = odd+1;
           }
        } System.out.println("Even: " + Even);
        System.out.println ("Odd: " + odd);
        System.out.println("Positive: " + Positive);
        System.out.println("Negative: " + Negetive);
    } 
    
}