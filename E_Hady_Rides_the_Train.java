import java.util.*; 
public class E_Hady_Rides_the_Train {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        long x = sc.nextLong();

        long a = x/4;
        
       

        if (a % 2 != 0) {
            long b =3 -( x % 4);
            System.out.println(a + " " + b);
        } 
        else {
            long c = x%4;
            System.out.println(a + " " + c);
        }
       
    }
}