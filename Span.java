import java.util.*;

public class Span {

    public static void main(String[] args) {
        int arr[] = { 10, 100, 1, 3, 2, 70 };

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int span = max - min;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println(span);
    }
}