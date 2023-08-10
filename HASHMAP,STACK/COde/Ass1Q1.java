import java.util.*;

public class ASS1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of value you want to store in the Map:");
        int n = sc.nextInt();
        TreeMap<Integer, String> tree = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.nextLine();
            tree.put(key, value);
        }
        System.out.println("the sorted Map is :" + tree);
    }

}
