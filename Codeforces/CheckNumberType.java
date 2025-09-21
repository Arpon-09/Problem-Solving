import java.util.Scanner;

public class CheckNumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next(); // Read input as string to preserve format
        if (input.contains(".")) {
            // It's a float
            String[] parts = input.split("\\."); // split into two parts
            String integerPart = parts[0];
            String decimalPart = parts[1];

            // If decimal is all zeros → it's an integer
            if (decimalPart.matches("0+")) {
                System.out.println("int " + integerPart);
            } else {
                System.out.println("float " + integerPart + " 0." + decimalPart);
            }
        } else {
            // No decimal → definitely an int
            System.out.println("int " + input);
        }
    }
}
