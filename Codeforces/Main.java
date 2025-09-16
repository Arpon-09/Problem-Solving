import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int T = fr.nextInt();
        while (T-- > 0) {
            long n = fr.nextLong();
            long s = fr.nextLong();
            
            ArrayList<Long> result = new ArrayList<>();

            for (long i = n; i >= 1; i--) {
                if (s >= i) {
                    s -= i;
                    result.add(i);
                }
            }

            if (s == 0) {
                for (long num : result) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}