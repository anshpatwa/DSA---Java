public class ceiling_of_a_number {

    // this method tell you about :
    // if the number is not present in the arr then it will show the position  next bigger number preseent in the array.
    // ceiling = smallest element in array greater of = target
    // this function can also be used to identify the postion of newly adding number in the sorted array.
    static int ceiling(int[] arr,int target){
        if (target>arr[arr.length-1]) {
            return -1;
        }// if the target number is greater then the last element of sorted array then it will return 1.
        // if the target is greater then arr.length-1, then we can return the arr.length to show the new postion of element be added.
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=ceiling(arr, 20);
        System.out.println(ans);
    }
    
}
