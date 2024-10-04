import java.util.Arrays;

public class max_selection_sort {
    // replacing the maximum element with the last index
    public static int[] maxSelectionSort(int[] arr){
        // swaps the maxelement to the righest position.
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1; // last position -1 in every iteration.
            int maxIndex=maxelement(arr, 0, last); 
            swap(arr,maxIndex, last);
        }
        return arr;
    }
    public static int maxelement(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if (arr[max]<arr[i]) {
                max=i;    // returns the position of max element 
            }
        }
        return max;
    }
    public static void swap(int[]arr,int first,int second){
        int temp =arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(maxSelectionSort(arr)));
      
    }
}
