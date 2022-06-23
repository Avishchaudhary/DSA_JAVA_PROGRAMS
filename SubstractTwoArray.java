public class SubstractTwoArray {
    public static void main(String[] args) {
        int first[] = { 9, 4, 5, 7, 4 };
        int second[] = { 1, 4, 8, 7, 8 };
        int third[] = new int[first.length > second.length ? first.length : second.length];
        int i = first.length - 1;
        int j = second.length - 1;
        int k = third.length - 1;
        int carry = -1;
        while (i >= 0 || j >= 0) {
            int digitsum = 0;
            if (first[i] < second[j]) {
                digitsum = first[i] + 10 + carry - second[j];
            } else {
                digitsum = first[i] + carry - second[j];
            }
            third[k] = digitsum;
            i--;
            j--;
            k--;
        }
        for (int ele : third) {
            System.out.print(ele + " ");
        }
    }
}
