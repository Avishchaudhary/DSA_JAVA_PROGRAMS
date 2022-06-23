public class WindowSlidingTechniques {
    public static void main(String[] args) {
        // count sub array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        int subarraycount = 0; // we will find out the count of sub array that's why we will take a variable
                               // sub array
        // Now firts we traverse a loop
        for (int i = 0; i < k; i++) {
            subarraycount++; // humne pehle jitna k diya hua hai utna nikal liya
        }
        System.out.println(subarraycount);
        for (int i = k; i <= arr.length - k; i++) {
            subarraycount++;
        }
        System.out.println(subarraycount);
    }
}
