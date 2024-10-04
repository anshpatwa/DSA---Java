import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class all_Disappeared_elements_in_array {
    public static List<Integer> missedNumber(int[] nums){
        int i=0;
        while (i<nums.length) {
            int original =nums[i]-1; // position
            if (nums[i]<=nums.length && nums[original]!=nums[i]) {
                swap(nums, i, original);
                // System.out.println(Arrays.toString(arr));
            }
            else{
                i++; 
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int index=1;index<=nums.length;index++){
            if (index != nums[index-1]) {
                result.add(index);
            }
        }
       
        return result;
    }
    public static void swap(int[] arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[]arr={1,1};
        System.out.println(missedNumber(arr));
    }
}
