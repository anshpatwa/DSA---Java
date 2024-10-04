public class peak_mountain_array {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;int end=arr.length-1;
        while (start<end) {
            int mid =start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                // in decreasing part of arr
                end=mid;
            }else{
                // in increasing part of arr
                // (arr[mid]<arr[mid+1])
                start=mid+1;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    
}
