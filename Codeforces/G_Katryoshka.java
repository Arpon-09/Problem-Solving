import java.util.*;

public class G_Katryoshka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long Eyes = sc.nextLong();
        long Mouths = sc.nextLong();
        long Bodies = sc.nextLong();

        long total = 0;

    
        long combo3 = Math.min(Eyes, Math.min(Mouths, Bodies));
        Eyes -= combo3;
        Mouths -= combo3;
        Bodies -= combo3;
        total += combo3;

        long combo1 = Math.min(Eyes / 2, Bodies);
        Eyes -= combo1 * 2;
        Bodies -= combo1;
        total += combo1;

        long combo2 = Math.min(Eyes / 2, Math.min(Mouths, Bodies));
        Eyes -= combo2 * 2;
        Mouths -= combo2;
        Bodies -= combo2;
        total += combo2;

        System.out.println(total);
    }
}
