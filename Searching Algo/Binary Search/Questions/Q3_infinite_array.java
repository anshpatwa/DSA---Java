public class Q3_infinite_array {
    //// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static int searchingRange(int[]nums ,int target){
        int start=0;
        int end=1;
        while (target>nums[end]) {
            int temp=end+1;// new start
            end =end+(end-start+1)*2;// new end
            start=temp;
        }
        return binarySearch(nums, target, start, end);
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
        int[]arr={3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
            int target =10;
            System.out.println(searchingRange(arr, target));
        
    }
}
