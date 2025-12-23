import java.util.*;

public class A_ASCII_Art_Contest {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = 0;
        int max = 0;

        if (a >= b && a >=c) {
            max = a;
        }

        if (b>= a && b>= c) {
            max = b;
        }

        if (c >= a && c>= b) {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        }
        if (b <= a && b <= c) {
            min = b;
        }
        if (c <= a && c <= b) {
            min = c;
        }


        if (max - min >= 10) {
            System.out.println("check again");
            return;
        } if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        } if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        } if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        } 
     
                    System.out.println("final "+b);



        
    } 
}
