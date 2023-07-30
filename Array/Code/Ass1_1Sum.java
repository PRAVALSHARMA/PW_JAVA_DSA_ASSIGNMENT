public class Ass1_Sum {
    // sum of even elment in array
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 3, 2 };
        int i = 0, sum = 0;
        while (i < arr.length) {
            sum += arr[i];
            i += 2;
        }
        System.out.println(sum);
    }

}
