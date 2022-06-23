public class FindPeakElementByBinarySearch {
    public static void main(String[] args) {
        int arr[]={ 1, 2, 1, 3, 5, 6, 4 };
        int n = arr.length;
        int peakelement = 0;
        int low=0;
        int high=arr.length-1;
        if(n==1){ //This is my first condition
            System.out.println("The peak element is "+arr[0]);
            return;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==0 && mid<n-1){ //aisa karke ye aisa ho jata hai ki ab ye naa to last mei dundra naa hi ye bilkul starting mei dundra matlab ye mid mei dundra hai
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    System.out.println("My peak element is "+arr[mid]);
                    return;
                }
                else if(arr[mid-1]>arr[mid]){
                    high=mid-1;//vo hi same process hai jo humne pehle follow kiya hai
                }
                else{
                    low=mid+1;
                }else  if(mid==0){
                    if(arr[0]>arr[1]){
                        System.out.println("My peak element is"+arr[0]);
                        return;
                    }
                    // agar aisa nahi hai tovo ab agla element return kar dega yaani arr[1] wala
                    else{
                        System.out.println("My peak element is "+arr[1]);
                        return;
                    }
                }
                else if(mid == n-1){
                    if(arr[n-1]>arr[n-2]){
                        System.out.println("My peak element is "+arr[n-1]);
                        return;
                    }
                    else{
                        System.out.println("My peak element is "+arr[n-2]);
                        return;
                    }
                }
            }
        }
    }
}
