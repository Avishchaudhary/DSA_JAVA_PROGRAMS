public class RangeQuerySum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };// tghis is my original array jiskla mujhe sum karna hai
        int prefixsum[] = new int[arr.length];
        prefixsum[0] = arr[0];// isse hum aisa bol rahe hai ki prefixsum ka pehle index m jab hum 0+1 karenge
                              // to vo arrka pehla element hi to ayyega to humne pehle se hi prefixsum[o]
                              // element par humne arr[0] wala elements rakh diya hai
        for (int i = 1; i < prefixsum.length; i++) { // 1 isliye liya hai humne kyoki 0 index to hum pehle se hi take
                                                     // care
                                                     // kar chuke hai
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }
        for (int ele : prefixsum) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int lowerrange = 0;
        int upperrange = 5;
        if (lowerrange == 0) {
            System.out.println(prefixsum[upperrange]);
        } else {
            System.out.println(prefixsum[upperrange] - prefixsum[lowerrange - 1]);
        }
        int arr2[] = { 20, 1, 40, 50, 9, 80, 100, 50, 500, 400 };
        int prefixmax[] = new int[arr2.length];
        prefixmax[0] = arr2[0];
        for (int i = 1; i < prefixmax.length; i++) {
            prefixmax[i] = Math.max(prefixmax[i - 1], arr2[i]);
        }
        for (int p : prefixmax) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
