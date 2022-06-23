import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 3, 1, 10, 4 };
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        int sum = 9;
        while (i < j) {
            int k = arr[i] + arr[j];
            if (sum == k) {
                System.out.println(arr[i] + " " + "i index " + arr[j] + " " + "j index");
                return;
            } else if (k > sum) {
                j--;
            } else if (k < sum) {
                i++;
            }
        }
    }
}
