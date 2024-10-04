import java.util.Arrays;

public class swap {
    static void swap(int[] arr,int index1,int index2){ // make it int [][] arr for 2-d swap
        int temp=arr[index1];   // change this to int[] temp = arr[index1]; for 2-D swap                       // temp bhee toh ek array hoga na isme tum dusra array store karoge.
        arr[index1]=arr[index2];
        arr[index2]=temp;

        // System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        // 1-D ARAAY SWAP
        int arr[]={1,2,3,4,5,6};
        // swap(arr, 0, 1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));


        // 2-D ARRAY SWAP
        // int[][] arr={
        //     {1,2,3},
        //     {4,5},
        //     {6,7},
        // };
        // swap(arr, 0, 1);    
        // for(int[]a:arr){
        //     System.out.println(Arrays.toString(a));
        // }
    }
    
}
