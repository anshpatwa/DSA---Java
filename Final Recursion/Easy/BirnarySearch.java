public class BirnarySearch {
    static int BinarySearch(int[] arr , int target , int start, int end){
         if (start>end){
             return -1;
         }
         int mid = start +(end-start)/2;
         if (arr[mid]==target){
             return mid;
         }
         if (arr[mid]<target){
             return BinarySearch(arr,target,mid+1,end);
         }
         return BinarySearch(arr,target,start,mid-1);
    }
    public static void main(String[] args) {
        int[] array = {11,22,33,44,55,66,77,88,99,110};
        System.out.println(BinarySearch(array,110,0,array.length-1));
    }
}
// Debug and Expand the Knowledge .
