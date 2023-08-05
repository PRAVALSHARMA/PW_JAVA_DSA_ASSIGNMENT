import java.util.Scanner;

public class Ass1Code {
    public static int Sum(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10 + Sum(num / 10));
    }

    public static void main(String[] args) {
        System.out.println("Enter the numbers ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Sum(n);
        System.out.println("The sum is : " + result);
    }
}