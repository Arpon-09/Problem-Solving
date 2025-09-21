import java.util.*;

public class B_Drawing_X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int mid = N / 2; // center index

        for (int i = 0; i < N; i++) {          // row
            for (int j = 0; j < N; j++) {      // column
                if (i == j && i == mid) {
                    // center cell
                    System.out.print("X");
                } else if (i == j) {
                    // main diagonal
                    System.out.print("\\");
                } else if (i + j == N - 1) {
                    // anti diagonal
                    System.out.print("/");
                } else {
                    // all other positions
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
