public class Roated_Binary_search {

    // finding pivot
    public static int findpivot(int[]arr,int index){
        if (index==arr.length) {
            return -1;
        }if (arr[index]>arr[index+1]) {
            int pivot = arr[index];
            return index;
        }
        return findpivot(arr, index+1);
    }

    // // find the elemnt in rotated array using binary search
    
    public static int rotated_search(int[]arr,int target,int start,int end){
       int pivot = findpivot(arr, 0);
       if (arr[pivot]==target) {
        return pivot;
       }if (target>=arr[start]&&target<=arr[pivot]) {
        return binarySearch(arr, start, pivot-1, target);
       }
       return binarySearch(arr, pivot+1, end, target);
    }

    // binary search
    public static int binarySearch(int[]arr,int start,int end,int target){
        if (start>end) {
            return -1;
        }
        int mid = start+(end-start)/2;
        
        if (arr[mid]==target) {
            return mid;
        }
        if (arr[mid]<target) {
            return binarySearch(arr, mid, end, target);  // return krna zarooori hai verna tu call krdo funcction fhir woh uska kaam krke baitth jaye but still kucch retunr me aaye hi nah.
        }
           return binarySearch(arr, start, mid, target);
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        // System.out.println(findpivot(arr, 0));
        System.out.println(binarySearch(arr, 0, arr.length-1, 8));
        int[] arr2= {5,6,7,8,9,1,2,3,4};
        System.out.println(rotated_search(arr2, 2, 0, arr2.length-1));
    }
}
// for rotated arrays we use right shift or left shift operator
