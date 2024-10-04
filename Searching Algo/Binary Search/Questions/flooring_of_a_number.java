public class flooring_of_a_number {
    // floor= greatest numbe4r smaller or = target;
    static int flooring(int [] arr, int target){
        if (target>arr[arr.length-1]) {
            return -1;
        }
        int start=0;
        int end =arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end =mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=flooring(arr, 15);
        // when target =15; --> it tell us that 14 is the closest smaller number to the target present in the sorted array
        System.out.println(ans);
    }
}
