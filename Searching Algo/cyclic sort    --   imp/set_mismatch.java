import java.util.Arrays;

public class set_mismatch {
    // https://leetcode.com/problems/set-mismatch/description/
    //[position,correction]
    public static int[] findErrorNums(int[] nums) {
      int i=0;
      while (i<nums.length) {
        int original =nums[i]-1;
        if (nums[i]<=nums.length &&nums[original]!=nums[i]) {
           swap(nums, i, original); 
        }else{
            i++;
        }
      }  
      for(int j=0;j<nums.length;j++){
        if (j!=nums[j]-1) {
            return new int[]{nums[j],j+1};
        }
      }
      return new int[]{-1,-1};
    }
    public static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second] =temp;
    }
    public static void main(String[] args) {
        int[] arr={2,2};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
