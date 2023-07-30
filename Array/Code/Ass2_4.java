import java.util.Scanner;
// largest element in 2D array

public class Ass2_4 {
    public static void main(String[] args) {

        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        m = sc.nextInt();

        int arr[][] = new int[m][m];

        int i, j;
        int largest = Integer.MIN_VALUE;

        System.out.println("enter the  matrix element : ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                largest = Math.max(largest, arr[i][j]);
            }
        }
        System.out.println(largest);
    }

}
