public class ThirdLargestlement {
    public static void main(String[] args) {
        int arr[] = { 10, 50, 20, 40, 100, 9999 };
        int max = arr[0];
        int SecondLargest = arr[0];
        int ThirdLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The first largest element in the array is " + max);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] > SecondLargest) {
                    SecondLargest = arr[i];
                }
            }
        }
        System.out.println("The second Largest element in the array is " + SecondLargest);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                if (arr[i] != SecondLargest) {
                    if (arr[i] > ThirdLargest) {
                        ThirdLargest = arr[i];
                    }
                }
            }

        }
        System.out.println("The third largest element in the array is " + ThirdLargest);
    }
}
