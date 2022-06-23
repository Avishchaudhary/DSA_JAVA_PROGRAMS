public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        // suppose hum search karna chahate hai 80 ko so we declared a search variable
        int search = 80;
        // to jaise humne animation mei dekha tha to ab hum iska ek mid point bana lete
        // hai
        while (low <= high) {
            mid = (low + high) / 2;
            // ho sakta hai ki jo elements hum find kar arhe hai vo yahi par mil jaye , agar
            // aisa hota hai to hum isk yahi par declared kardete hai
            if (search == arr[mid]) {
                System.out.println("Number is found......");
                return;
            }
            if (search > arr[mid]) {
                low = mid + 1;// yha par hum left to right bad rahe hai
            } else if (search < arr[mid]) {
                high = mid - 1;// yha par hum right to left bad rahe hai
                // asal mei hum narrow kar rahe hai
            }
        }
        System.out.println("Number not found.....");
    }
}
