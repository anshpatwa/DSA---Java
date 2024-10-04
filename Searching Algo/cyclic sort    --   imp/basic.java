import java.util.Arrays;

public class basic {
    public static int[] cyclicSort(int[] arr){
       int i =0;
       while (i<arr.length) {
        int original = arr[i]-1;    // when [0,n] then original =arr[i] and   when[1,n] original =arr[i]-1
        if (arr[i]<=arr.length &&arr[original] != arr[i]) {
            swap(arr,i, original);
        }else{
            i++;
        }
       }
        return arr;
    }
    public static void swap(int[]arr,int first,int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1}; 
        // this method will not work if the array contains 0.
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }
    
}
