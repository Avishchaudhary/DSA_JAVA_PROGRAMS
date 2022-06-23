public class SubArraySumByWindowSlidingTechnique {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int k = 3;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        } // 1+2+3
        System.out.println(sum);
        // agar mei kisi tarh 6+4-1 kardu or fir aise hi karta jau to mera output aa
        // jaayega
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            // bus ab mei jaise jaise sum nikalta jaayega aise aise mei print karta jaaunga
            System.out.println(sum);
        }
    }
}
