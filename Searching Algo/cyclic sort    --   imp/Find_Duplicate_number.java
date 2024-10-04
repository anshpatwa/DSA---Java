import java.util.Arrays;
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class Find_Duplicate_number {
    public static int findDuplicates(int[] nums){
        int i=0;
        while (i<nums.length) {
           
            int original =nums[i]-1;
            if (nums[i]<=nums.length &&nums[original]!=nums[i]) {
                swap(nums, i, original);
            }else{
                i++;
            }
        }
        return nums[nums.length-1];// this work only if elements in [1,n] are consecutive. and in question it is given the array contains n+1 integer
    }
    public static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second] =temp;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(findDuplicates(arr));
    }
}
