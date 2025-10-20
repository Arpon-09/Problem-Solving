import java.util.*;
public class A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] [] = new int[n][3];

        for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                arr [i] [j] = sc.nextInt();
            }
        }for (int i=0; i<n; i++) {
            for (int j=0; j<3; j++) {
                System.out.println(arr[0]);
            } System.out.println();
        }
    }
}