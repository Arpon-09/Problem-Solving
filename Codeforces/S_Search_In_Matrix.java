import java.util.*;
public class S_Search_In_Matrix {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        

        int arr [][] = new int[r][c];

        for (int i=0; i <r; i++) {
            for (int j=0; j<c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int X = sc.nextInt();
          boolean takenum = true;

         for (int i=0; i <r; i++) {
          
            for (int j=0; j<c; j++) {
                if (arr[i][j] == X) {
                 
                   takenum = false;
                   break;
            }
        }
    } if (takenum) {
        System.out.println("will take number");
    } else {
        System.out.println("will not take number");
    }
}
}