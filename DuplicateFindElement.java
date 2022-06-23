public class DuplicateFindElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2 };
        // Now we start a traversal
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;// m is array pe jaaunga or is array ki madad se m is aerray ka index
                                             // nikalunga o minus 1 isliye kiya taaki array out of bound naa hojaaye or
                                             // Math.abs isiliye lagaya ki ye negative naa ho jaaye
            int value = arr[index];
            if (value < 0) {
                // matlab agar vo value pehle se i marked yaa fir hum keh sakte hai ki agar vo
                // value pehle se hi visited hai to vo element duplicate hai.
                System.out.println("Duplicate  " + (index + 1));// index mei +1 isiliye kiya hai humne kyoki humne upar
                                                                // index mei se -1 kar diya tha naa
                return;
            } else {
                // marked by the negative
                arr[index] = arr[index] * -1;
            }

        }
    }
}
