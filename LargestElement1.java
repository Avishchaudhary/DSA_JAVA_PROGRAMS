public class LargestElement1 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 30, 80, 90 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The first smallest element in the array is " + min);
    }
}
