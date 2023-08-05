import java.util.Scanner;

public class Ass3Q2 {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("false");
        }
        if ((n & (n - 1)) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
