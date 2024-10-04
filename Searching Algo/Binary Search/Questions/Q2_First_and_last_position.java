import java.util.Arrays;

public class Q2_First_and_last_position {
    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
  public static int[] searchRange(int[]nums,int target){
    int[] ans ={-1,-1};
    // for start index
    ans[0]=search(nums,target,true);
    if (ans[0] !=-1) {
    //for end index 
        ans[1]=search(nums,target,false);
    }
    return ans;
  }
  public static int search(int[] nums, int target,boolean findStartIndex){
    int ans =-1;
    int start=0;
    int end =nums.length-1;
    while (start<=end) {
        int mid= start+(end-start)/2;
        if (target<nums[mid]) {
            end=mid-1;
        }else if (target>nums[mid]) {
            start=mid+1;
        }else{
            //potenial ans
            ans=mid;
            if (findStartIndex==true) {
                end=mid-1; // check for left sideś
            }else{
                start=mid+1;// check for right side
            }
        }
    }
    return ans;
  }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int start =search(nums, 8, true);
        int end =search(nums, 8, false);
        System.out.println(start);
        System.out.println(end);
        int[] arr = searchRange(nums, 8);
        System.out.println(Arrays.toString(arr));
    }
}
