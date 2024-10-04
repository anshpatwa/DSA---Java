import java.util.Arrays;

public class B_S {
    // equation building
    //hard concepts of .length() function
    // khel of start and mid
    public static int Binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        // int mid= (start+end)/2;
        

        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
        
    }


    // ******************OrderAgnosticBS********************************
    
    static int orderAgnosticBS(int[]arr, int target){
        int start=0;
        int end=arr.length-1;
        // int mid= (start+end)/2;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid= start+(end-start)/2;
            if (mid==arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target>arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid-1;
                }
            }else{
                if ( target>arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return -1;
    }
    

    public static void main(String[] args) {
        int[] meriarray={23,34,45,56,67,78,89,99,109,129,119,139,149,159};
        System.out.println(Binarysearch(meriarray,89));
        int[] bekararray={10,9,8,7,6,5,4,3,2,1};
        Arrays.sort(bekararray);
        
        System.out.println(Arrays.toString(bekararray));
   
    }
    
}
