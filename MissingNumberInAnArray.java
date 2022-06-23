//find the missing number in the given array
public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        int sn = 0;
        int sr = 0;
        int result;
        int n = arr[arr.length - 1];
        for (int i = 0; i <= n; i++) {
            sn = sn + i;
        }
        System.out.println("sun of n natural number are " + sn);
        for (int j = 0; j <= arr.length - 1; j++) {
            sr = sr + arr[j];
        }
        System.out.println("Sum of array element are " + sr);
        System.out.println("Now ");
        result = sn - sr;
        System.out.println("Missing number is " + result);
    }
}