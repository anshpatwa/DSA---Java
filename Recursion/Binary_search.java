public class Binary_search {
    public static int search(int[] arr,int target,int start,int end){
        if (start>end) {
            return-1;
        }
        int mid =start+(end-start)/2;
        if (target==arr[mid]) {
            return mid;
        }
        if (target<arr[mid]) {
          return  search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
    public static void main(String[] args) {
        int[] nums={11,22,33,44,55,66,77,88,99};
        System.out.println(search(nums, 99, 0, nums.length-1));
        
    }
}

