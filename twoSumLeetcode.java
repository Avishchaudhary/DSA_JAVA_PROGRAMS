import java.util.Arrays;
import java.util.HashMap;

public class twoSumLeetcode {
    public static void main(String[] args) {
        int arr[] = { 2, 9, 6, 3, 5, 10, 4 };
        int sum = 9;
        // we will used the hash map approaches
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = sum - arr[i];
            if (map.get(arr[i]) == null) {
                map.put(key, i);
            } else {
                System.out.println("pair found " + map.get(arr[i]) + " current index " + i);
            }
        }
    }
}
