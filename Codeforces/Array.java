import java.util.*;
public class Array {

    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int x = 5;

        int size = sc.nextInt();

        int [] marks = new int [size];

        for (int j=0; j< size; j++) {
            marks[j] = sc.nextInt();
        }

        for (int i=0; i <marks.length; i++) {

            if (marks [i] == x) {
                System.out.println("num found idx: "+i);
            }
            
        }
    }
    
}
