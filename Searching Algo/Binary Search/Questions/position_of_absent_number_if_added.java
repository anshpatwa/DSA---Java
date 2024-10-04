public class position_of_absent_number_if_added {
    static int officialposition(int[]arr,int target){
        if (target>arr[arr.length-1]) {
            return arr.length;
        } // if the element is greater then the last element of sorted array. then it will tell to add the new element at the end.
        int start=0;
        int end = arr.length-1;
        while (start<=end) {
            int mid =start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }

        return start;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans = officialposition(arr, 15);
        // when target =20; --> it tells us that we can add the number the at the 7th position.
        
        System.out.println(ans);
    }
    
}
