public class Start_position {
    public static int binarySearch(int[]nums,int target){
        int ans=-1;
        int start=0;
        int end =nums.length-1;
        while (start<=end) {
            int mid= start+(end-start)/2;
            if (target<nums[mid]) {
                end=mid-1;
            }else if (target>nums[mid]) {
                start=mid+1;
            }else{
                System.out.println("mid"+mid);
                ans=mid;
                end =mid-1; // isse left side ke sarre elements check hoge.
                // agar right side ke check krne ho toh start = mid+1 .which will the last occuring index of target. 
            }
        }
            return ans;
    }
    public static void main(String[] args) {
        int[] nums ={5,6,7,7,8,8,8,10};
        int ans=binarySearch(nums, 8);
        System.out.println(ans);
    }
    
}
