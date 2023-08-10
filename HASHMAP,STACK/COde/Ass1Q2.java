import java.util.Scanner;
import java.util.TreeMap;

public class Ass1Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of value you want to store in the Map:");
        int n = sc.nextInt();
        TreeMap<String, Integer> tree = new TreeMap<>();
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            String key = sc.nextLine();
            tree.put(key, value);
        }
        System.out.println("the sorted Map is :" + tree);

    }
}
