import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int max = -1;
        ArrayList<Integer> leaderlists = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaderlists.add(max);
            }
        }
        Collections.reverse(leaderlists);
        System.out.println(leaderlists);
    }
}
