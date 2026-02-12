import java.util.Scanner;
import java.util.*;

public class problem7 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int [] nums = {1,2,3,4};
        int [] answer = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            int sum = 1;
            for (int j=0; j<nums.length; j++) {
                if (i != j) {
                    sum = sum * nums[j];
                }
            }

            answer[i] = sum;
        }

        System.out.println(answer);

    }
}
