import java.util.Scanner;

public class Ass2Code {
    static int go(int n, int i) {
        if (i == n + 1)
            return 0;
        if (i % 2 == 0)
            return go(n, i + 1) - i;
        else
            return go(n, i + 1) + i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no,");
        int n = sc.nextInt();
        System.out.println(go(n, 1));

    }

}
