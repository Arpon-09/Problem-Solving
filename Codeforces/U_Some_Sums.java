import java.util.*;
public class U_Some_Sums {

    public static int digitSum (int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        } return sum;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = 0;
       


        for (int i = 1; i<=a ; i ++) {
            int s = digitSum(i);
            if (s>= b && s <=c) {
                total = total + i;
            }
        }
        System.out.println(total);


    }
}