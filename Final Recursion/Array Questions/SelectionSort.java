import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    static void selectionsort(int[]arr, int row , int col , int max){
    if (row==0){return;}
    if (col<row){
        if (arr[col]>arr[max]) {
            selectionsort(arr,row,col+1,col);
        }else{
            selectionsort(arr,row,col+1,max);
        }
    }else{
        int temp = arr[max];
        arr[max] =arr[row-1];
        arr[row-1] =temp;

        selectionsort(arr,row-1,0,0);
    }
    }


    public static void main(String[] args) {
        int[] nums ={5,4,3,2,1};
        selectionsort(nums,nums.length,0,0);
        System.out.println(Arrays.toString(nums));
    }
}
/*

{4,3,2,1}
       [maxElement]  [sw,ap]   [After]
 1 --> [4]           [0,3]     [1,3,2,4]
 2 --> [3]           [1,2]     [1,2,3,4]


*/