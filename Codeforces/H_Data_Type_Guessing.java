import java.util.Scanner;

public class H_Data_Type_Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();
        long a = sc.nextLong();

        // Use log10 to avoid overflow: log10(n * k^a) = log10(n) + a * log10(k)
        double logResult = Math.log10(n) + a * Math.log10(k);

        double intMaxLog = Math.log10(Integer.MAX_VALUE);       // ≈ 9.33
        double longMaxLog = Math.log10(Long.MAX_VALUE);         // ≈ 18.96

        if (logResult <= intMaxLog) {
            System.out.println("int");
        } else if (logResult <= longMaxLog) {
            System.out.println("long long");
        } else {
            System.out.println("double");
        }
    }
}
