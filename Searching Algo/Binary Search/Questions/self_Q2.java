import java.util.Arrays;

public class self_Q2 {
    public static int[] findIndex(int[]nums,int target){
        int[] ans={-1,-1};
        ans[0]=searchRange(nums, target, true);
        if (ans[0] !=-1) {
            ans[1]=searchRange(nums, target, false);
        }
        return ans;
        
    }
    public static int searchRange(int[]nums,int target,boolean findtheIndex){
        int ans=-1;
        int start =0;
        int end =nums.length-1;
        while (start<=end) {
            int mid =start+(end-start)/2;
            if (target<nums[mid]) {
                end=mid-1;
            }else if (target>nums[mid]) {
                start=mid+1;
            }else{
                ans=mid;
                if (findtheIndex==true) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int start=searchRange(nums, 8, true);
        int end =searchRange(nums, 8, false);
        System.out.println("start_index:"+start);
        System.out.println("end_index:"+end);
       
        System.out.println(Arrays.toString(findIndex(nums, 8)));
        
    }
}
