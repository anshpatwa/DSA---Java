import java.util.Arrays;

public class missing_number {
    //https://leetcode.com/problems/missing-number/description/
    public static int missing_number(int[] nums){
        
        int i=0;
        while (i<nums.length) {       // sort krta hua chalega yeh loop
            int original = nums[i];
            if (nums[i]<nums.length && nums[original] != nums[i]) {
                swap(nums, i, original);
            }else{
                i++;
            }
        }
        for(int j =0;j<nums.length;j++){   // this loop check for missing values
            
            if (j!=nums[j]) {
                return j;
            }
        }
        System.gc();
        return nums.length;
    }
    public static void swap(int[]arr,int first ,int second){
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missing_number(arr));
        // System.out.println(Arrays.toString(missing_number(arr)));
    }
}
