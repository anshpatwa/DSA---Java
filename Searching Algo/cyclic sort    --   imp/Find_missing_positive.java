import java.util.Arrays;

public class Find_missing_positive {
    // https://leetcode.com/problems/first-missing-positive/description/
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int original=nums[i]-1;
            if (nums[i]>0 && nums[i]<=nums.length && nums[original]!=nums[i]) {
                swap(nums, i, original);
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if (j+1 != nums[j]) {
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second] =temp;
    }

    public static void main(String[] args) {
        int[]arr={7,8,9,11,12};
       System.out.println(firstMissingPositive(arr));
    }
}
