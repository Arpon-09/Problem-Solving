import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] numbers = new int[row][column];

        // Input
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                numbers[i][j] = sc.nextInt();
                System.out.print(numbers[i][j] + " ");
            
            }
             System.out.println();
        }

        // Output
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}