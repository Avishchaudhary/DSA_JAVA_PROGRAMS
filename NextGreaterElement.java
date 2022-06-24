import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = { 20, 7, 5, 14, 16 };
        // first we create a output array and declared the size also
        int output[] = new int[arr.length]; // and fill this array by default by 0
        // but we filled this array by -1 so array mei ek function hoya hai vo ye haiu
        Arrays.fill(output, -1);// which means all the values are become filled by -1 in the output array
        // then we make a stack or java k pass stack banane ke liye already stack naam
        // ki class hoti hai in the java.util mei
        Stack<Integer> stack = new Stack<>();// yha pe humne stack ko specified karke chod diya
        // now push the first item of arr in the stack
        stack.push(0); // storing 0th index
        // ab travese kara do
        for (int i = 1; i < arr.length; i++) {
            int index = stack.peek();// get the top element of the stack
            if (arr[index] >= arr[i]) { // dekh jo ye arr[ndex hai naa isme 20 yaani i se previous element rakha hua hai
                stack.push(i);
            } else {
                // some greater element found so keep pop the element till you find the bigger
                // element
                // to humne yha par while loop laga di
                while (arr[stack.peek()] < arr[i]) {
                    output[stack.peek()] = arr[i];// [ye stack.peek isliye kiya kyoki while loop ki wajah se stack baar
                                                  // baar usi mei hi ghumta rahega to har baar stack ko peek yaani naya
                                                  // milna jaroori hai that's why we take this]or aisa karne ke baad
                                                  // usko stack mei se delete kardo
                    stack.pop(); // delete isliye kiya jisse agle element ko moka nmil jaye

                }
                stack.push(i);
            }
        }
        // bus ab sara kaam khatam bus sirf array ko print karana reh gaya
        for (int ele : output) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
