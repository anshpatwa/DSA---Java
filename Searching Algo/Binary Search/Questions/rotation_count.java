
// to find the number of roatation occured in array
// logic = 
// rotations = pivot no. of times
public class rotation_count {
    public static int findRotations(int[]nums){
        // same code as findPivot
        
        int start =0;int end =nums.length-1;
        int pivot =-1;
        while (start<end) {
            int mid=start+(end-start)/2;
            if (nums[mid]>nums[mid+1]) {
                pivot=mid+1; // +1 to denote the NO.OF Rotations , not the position.
                return pivot;
            }else{
                if (nums[start]>nums[mid]) {
                   end=mid; 
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
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
      int[] arr={4,5,6,7,0,1,2};
      System.out.println("number of Rotations:"+findRotations(arr));  
    }
    
}
