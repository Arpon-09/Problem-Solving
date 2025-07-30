import java.util.*;

public class I_Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        
        
        

        int firstDigit = number / 10;  
        int secondDigit = number % 10; 

        if (secondDigit == 0) {
            System.out.println("YES");
            return;
        }
        if (firstDigit == 0 ) {
            System.out.println("NO");
        } else if (firstDigit % secondDigit == 0 || secondDigit % firstDigit == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
