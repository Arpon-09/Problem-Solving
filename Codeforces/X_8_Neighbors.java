import java.util.*;

public class X_8_Neighbors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        char arr [][] = new char[N][M];

        for (int i=0; i<N; i++) {
            String line = sc.nextLine();
            arr[i] = line.toCharArray();
        }

        int X = sc.nextInt()-1;
        int Y = sc.nextInt()-1;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        boolean allx = true;

        for (int i=0; i<8; i++) {
            int nx = X + dx[i];
            int ny = Y + dy[i];

            if (nx>=0 && nx<N && ny>=0 && ny<M) {
                if (arr[nx][ny] != 'x') {
                    allx = false;
                    break;
                }
            }

        } System.out.println(allx ? "yes" : "no");


    }
}
