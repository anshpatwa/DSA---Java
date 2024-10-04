public class minimum_in_Rotated_Array_duplicates {
    public static int findMinimum(int[] arr){
        int start =0;
        int end =arr.length-1;
        while (start<=end) {
            int mid =start+(end-start)/2;
           
            if (arr[end]<arr[mid]) {
                start=mid+1;
            }else if (arr[end]>arr[mid]) {
                end=mid-1;
            }
            else{
                end--;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] nums1 = {3,3,3,1,3};
    System.out.println(findMinimum(nums1));
    }
}
