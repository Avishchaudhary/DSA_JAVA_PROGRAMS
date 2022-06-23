public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 10, 15, 22, 30, 30, 30, 30, 30, 30, 50, 70, 90 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int search = 30;
        int firstindex = -1;
        int lastindex = -1;
        int occurence = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                firstindex = mid;// move to the low to high index
                high = mid - 1;
            }
            if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                lastindex = mid;// move to the low to high index
                low = mid + 1;
            }
            if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("First inex is " + firstindex + " Last index is " + lastindex);
        // And if you find out ki how many occurence of the search element so simply do
        occurence = lastindex - firstindex;
        System.out.println(occurence);
    }
}
