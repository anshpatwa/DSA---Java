public class search_rotated_array {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/description/

    
    // this will not work for duplicate values
    public static int searchRotated(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0 , arr.length - 1);
        }
        // Check if the target is equal to the pivot element
        if (arr[pivot] == target) {
            return pivot;
        }
    
        // Search in the left sorted subarray
       
        int leftResult = binarySearch(arr, target, 0, pivot - 1);
        if (leftResult != -1) {
            return leftResult;
        }
        
        // Search in the right sorted subarray
        int rightResult = binarySearch(arr, target, pivot + 1, arr.length - 1);
        return rightResult;
        
    }
    public static int findPivot(int[]arr){
        int start=0;int end=arr.length-1;int pivot=-1;
        while (start<end) {
            int mid =start+(end-start)/2;

            if (mid < end &&arr[mid]>arr[mid+1]) {
                pivot =mid;
                return pivot;
            }
            else{
                if (arr[start]>arr[mid]) {
                    end =mid;
                }else{
                    start=mid+1;
                }
            } 
            
        }
        return pivot;
    }
    public static int binarySearch(int[] nums,int target,int start,int end){
        while (start<=end) {
            int mid =start+(end-start)/2;
            if (target>nums[mid]) {
                start=mid+1;
            }else if (target<nums[mid]) {
                end=mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
       int[] arr= {2,5,6,0,0,1,2};
       System.out.println(searchRotated(arr, 0));
    }
    
}
