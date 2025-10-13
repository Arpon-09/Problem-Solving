import java.util.*;
public class T_Matrix {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr [][] = new int[s][s];
        int suma = 0;
        int sumb = 0;
        for (int i=0; i <s; i++) {
            for (int j=0; j <s; j++) {
                arr [i][j] = sc.nextInt();
            }
        }

         for (int i=0; i <s; i++) {
            for (int j=0; j <s; j++) {
               if ( i==j ) {
                suma = suma + arr[i][j];
                
               }
            }
        }

         for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i + j == s - 1) {  
                 sumb = sumb + arr[i][j];
            }
        }
    }
        
        int sumc = sumb - suma;
        System.out.println(sumc);
    }
}