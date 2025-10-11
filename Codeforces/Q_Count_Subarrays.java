import java.util.*;
public class Q_Count_Subarrays {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
       

        int T = sc.nextInt();

        while (T -- >0) {

             int count = 0;
            
        

        int S = sc.nextInt();
        
        int arr [] = new int[S];

        for (int i=0; i<S; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i = i+1) {
            for(int j=i; j<arr.length; j++) {

                Boolean nondec = true;

                for(int k=i; k<j; k++) {
                   if (arr[k] > arr[k+1]){
                    nondec = false;
                    break;
                   }
                    
                }
              if(nondec) {
                count++;
                
              }
            } 

        }   System.out.println(count);
    }
} 
}