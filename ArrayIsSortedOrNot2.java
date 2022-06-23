public class ArrayIsSortedOrNot2 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 900, 100 };
        // if we dont uesd the arr.length-1 wal funda
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println("Array is not sorted......");
                return;
            }
        }
        System.out.println("Array is sorted.........");
    }
}
