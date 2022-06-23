public class DNF {
    // make a function for swapping
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        int low = 0;
        int medium = 0;
        int high = arr.length - 1;
        while (medium <= high) {
            switch (arr[medium]) {
                case 0:
                    swap(arr, low, medium); // ye low or mid ke bich mei swap karne ka ek hi logi hai ki sabse pehle mei
                                            // take care karna chahata hu 0 or 1 ke bich mei swap thik hai.
                    low++;
                    medium++; // taaki ye dono aage bad sake
                    break;
                case 1:
                    medium++;// is jagah par humne swap isliye nahi ki kyoki agar 0 sahi tarah se print ho
                             // jata hai or last mei 2 to automatically 1 to bich mei hi aayega naa
                    break;
                case 2:
                    swap(arr, high, medium);
                    high--;
                    break;
            }
        }
        // Now print the array/traverse the array
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
