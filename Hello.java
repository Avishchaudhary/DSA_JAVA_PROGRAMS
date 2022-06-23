public class Hello {
    static boolean search(int arr[], int index, int element) {
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == element) {
            return true;
        }
        return search(arr, index + 1, element);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 6, 8, 3, 4, 8, 4 };
        if (search(arr, 0, 4)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
