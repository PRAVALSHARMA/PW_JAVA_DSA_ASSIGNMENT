public class Ass1Q4 {
    public static int sum(int[] arr, int n) {

        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sum(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = { 13, 1, -3, 22, 5 };
        int n = arr.length;
        int resut = sum(arr, n - 1);
        System.out.println("tjf" + resut);
    }

}
