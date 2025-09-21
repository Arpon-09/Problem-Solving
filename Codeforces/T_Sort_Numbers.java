import java.util.*; 
public class T_Sort_Numbers {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();

        Long [] arr = {A,B,C};

        Arrays.sort(arr);

        for(int i = 0; i<3; i++) {
            System.out.println(arr[i]);
        } System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}