public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 23, 3, 22, 2, 2 };
        int count = 0;
        int majorityelement = 0;
        int majocount = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            // first we check ki kya count mera initialy 0 hai
            if (count == 0) {
                majorityelement = arr[i];
            }
            if (majorityelement == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        // is wali iteration se hame ye to pata chal gaya ki mority elemeny kon but abhi
        // iska koi significance ni hai matlab abhi hame ye to malum ni hai ki vo
        // element n/2 aa rha ho to hum count ko 0 kar denge (hame element to pata chal
        // gaya but not proof)
        count = 0;
        // dobara se traversel karenge
        for (int ele : arr) {
            if (ele == majorityelement) {
                count++;
            }
        }
        System.out.println(count > majocount ? "Majority element is " + majorityelement
                : " no majority element will be exist in the array");
    }
}
