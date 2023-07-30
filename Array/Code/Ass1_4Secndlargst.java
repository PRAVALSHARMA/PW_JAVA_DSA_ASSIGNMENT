public class Ass1_4Secndlargst {
    // second largest element
    public static void main(String[] args) {
        int arr[] = { 3, 4, 64, 56, 57 };
        int second;
        int largest = second = Integer.MIN_VALUE;
        if (arr.length < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }

        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("%d\n", second);
    }

}
