public class Q4 {
    public static int searchInsert(int[]arr,int target){
        boolean present =false;
        for(int i=0;i<arr.length;i++){
            if (target==arr[i]) {
                present=true;
                return i;
            }
           if (arr[i]>=target) {
                return i;
           }   // floor

        }
        return arr.length;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int i =searchInsert(nums,2);
        System.out.println(i);

    }
    
}
