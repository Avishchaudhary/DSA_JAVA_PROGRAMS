public class ReverseArrayByTwoPointer {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        // my output will be as 50,40,30,20,10
        int i = 0;// first pointer
        int j = arr.length - 1;// 2nd pointer
        while (i < j) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // we used simply enhanced for loop for printing the array\
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}
