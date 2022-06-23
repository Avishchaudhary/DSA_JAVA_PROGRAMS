public class TwoArraySumWithCarry {
    public static void main(String[] args) {
        int First[] = { 2, 1, 4, 3 };
        int Second[] = { 9, 9, 9, 9 };
        int Third[] = new int[First.length > Second.length ? First.length : Second.length];
        int i = First.length - 1;
        int j = Second.length - 1;
        int k = Third.length - 1;
        int carry = 0;
        // int DigitSum=0;
        while (i >= 0 || j >= 0) {
            int DigitSum = carry;
            if (i >= 0) {
                DigitSum += First[i];
            }
            if (j >= 0) {
                DigitSum += Second[j];
            }
            carry = DigitSum / 10;
            DigitSum = DigitSum % 10;
            Third[k] = DigitSum;
            i--;
            j--;
            k--;
        }
        if (carry > 0) {
            System.out.print(carry);
        }
        for (int ele : Third) {
            System.out.print(ele + " ");
        }
    }
}
