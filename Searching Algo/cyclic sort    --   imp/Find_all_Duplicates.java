import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_all_Duplicates {
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
     public static List<Integer> findDuplicates(int[] nums) {
        int i=0;
        List<Integer> newlist=new ArrayList<>();
        while (i<nums.length) {
            int original=nums[i]-1;
            if (nums[i]<=nums.length &&nums[original]!=nums[i]) {
               swap(nums, i, original); 
            }else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if (j!=nums[j]-1) {
                newlist.add(nums[j]);
            }
        }
        return newlist;
    }
    public static void swap(int[] arr, int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second] =temp;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
