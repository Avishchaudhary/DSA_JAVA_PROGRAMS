public class RotateAnArray {
    // jab hum reverse wala logic used karenge to hum ek function bana lete hai
    // reverse naam ka or hame pata hai ki function ko reverse karate time hume do
    // pointers ki madad chaiyee hogi
    static void reverse(int arr[], int i, int j) {
        // swap kara diye
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // is question mei hum reverse wala logic used kar sakte hai jo humne array ko
        // reverse karne mei lagaya tha
        int arr[] = { 10, 20, 30, 40, 50 };
        int k = -15;
        k = k % arr.length;// handle overflow case
        if (k < 0) { // negative case
            k = arr.length + k;
        }
        // reverse the first part of the array
        reverse(arr, 0, arr.length - k - 1);
        // reverse the second part of the array
        reverse(arr, arr.length - k, arr.length - 1);
        // reverse the full array
        reverse(arr, 0, arr.length - 1);
        // Now print the array
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
