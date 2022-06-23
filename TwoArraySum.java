//Sum of two array 
public class TwoArraySum {
    public static void main(String[] args) {
        int First[] = { 4, 5, 7, 8 };
        int Second[] = { 1, 2, 1, 1 };
        int Third[] = new int[First.length > Second.length ? First.length : Second.length];
        ;
        int i = First.length - 1;
        int j = Second.length - 1;
        int k = Third.length - 1;
        // int Digitsum=0;
        while (i >= 0 || j >= 0) {
            int Digitsum = 0;
            // check karo pehle jakar ki i kahi exhaust to nahi hoga naa
            if (i >= 0) {
                Digitsum += First[i];
            }
            // same thing hum j ke sath bhi karenge
            if (j >= 0) {
                Digitsum += Second[j];
                // but hum ktya karenge ki is sum ki jagah par hum iska naam change karke
                // Digitsum kar denge
            }
            // ab ye Digitsum yaani isne first or second array ke last last digit ka sum
            // kiya hai or sum krke apne mei store kiya hai vo ab third array m store ho
            // jaaye vo hi kth term kth term ka matlab last wali jagah par
            Third[k] = Digitsum;
            // or ab ye sab karne ke baad sabko - kardo aise
            i--;
            j--;
            k--;
            // ye jo hai ye without carry wali condition hai bhai avish
            // Now we will cros check

        }
        // print the result array third
        for (int ele : Third) {
            System.out.print(ele + " ");
        }
    }
}