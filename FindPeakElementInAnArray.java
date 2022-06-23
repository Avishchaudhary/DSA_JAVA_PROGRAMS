public class FindPeakElementInAnArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
        int n = arr.length;
        int peakelement = 0;
        if (n == 1) {
            System.out.println("Peak element is " + arr[0]);
            return;
        }
        // Ab humne ispar ek for loop chala di
        for (int i = 0; i < n; i++) {
            if (i == 0) { // first index case
                if (arr[i] > arr[i + 1]) {
                    peakelement = arr[i + 1];
                }
            } else if (i == n - 1) { // last index case
                if (arr[i - 1] < arr[i]) {
                    peakelement = arr[i];
                }
            } else { // check the neighbour
                if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
                    peakelement = arr[i];
                }
            }
        }
        System.out.println("My peak element is " + peakelement);
    }
}
