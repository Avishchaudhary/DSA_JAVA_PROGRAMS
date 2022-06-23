import java.util.Arrays;

public class WaveArrayNotSortedDemo {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 7, 9, 78, 87, 9, 15, };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            // Directly performed the swapping logic
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
