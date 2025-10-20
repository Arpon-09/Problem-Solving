import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr [] = new int[N+1];

        int Q = sc.nextInt();

        int qur[][] = new int[M][2];

        for (int i=1; i<=N; i++) {
            int X = sc.nextInt();
            arr[X] = arr[X] + 1;
        }

        for (int i=0; i<Q; i++) {
            qur [i][0] = sc.nextInt();
            qur [i][1] = sc.nextInt();
        }

        




    }
}