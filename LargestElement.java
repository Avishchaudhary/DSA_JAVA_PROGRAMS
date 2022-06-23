public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 25, 90, 88 };
        Boolean isLargest = false;
        for (int i = 0; i < arr.length; i++) {
            isLargest = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest) {
                System.out.println("The largest element is " + arr[i]);
                return;
            }
        }
    }
}
