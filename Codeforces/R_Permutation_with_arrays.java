import java.util.*;
public class R_Permutation_with_arrays {
    
public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int sum = 0;
        int tum = 0;

        int arra [] = new int[s];
        int arrb [] = new int[s];

        for (int i=0; i<s; i++) {
            arra[i] = sc.nextInt();
        }
        for (int i=0; i<s; i++) {
            arrb[i] = sc.nextInt();
        }

        for (int i=0; i<s-1; i++) {
            for(int j=0; j<s-i-1; j++){
                if (arra[j] > arra[j+1]){
                    int temp = arra[j];
                    arra[j] = arra[j+1];
                    arra[j+1] = temp;
                }
            }
        }

        for (int i=0; i<s-1; i++) {
            for(int j=0; j<s-i-1; j++){
                if (arrb[j] > arrb[j+1]){
                    int temp = arrb[j];
                    arrb[j] = arrb[j+1];
                    arrb[j+1] = temp;
                }
            }
        }

        if (Arrays.equals(arra, arrb)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        
        
       

       

       
        
    }
}