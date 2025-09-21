import java.util.*;
public class F_Break_Number {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        long Test_case = sc.nextLong();
        lon count = 0;

        int nums [] = new int [Test_case];
        int d = 0;
        

        for(int i=0; i<Test_case; i++) {
            nums [i] = sc.nextInt();
        }

        for(int i=0; i<nums.length; i++) {
            int number = nums[i];
            count = 0;
            
           
            while (number > 1 && number % 2 == 0) {
              
                    number = number / 2;
                    count++;
                }
                 if (d < count) {
                    d = count;
                }

                
            }System.out.println(d);
             
                
        } 
    }

