import java.util.Arrays;

public class basics {
    // bubble sort == sinking sort == exchange sort
    public static int[] bubbleSort(int[]arr){
       boolean swap;
        int end = arr.length-1; // 4
        for(int i=0;i<=end;i++){ 
            swap=false;
            for(int j=0;j<end-i;j++){ // kyuki greatest element to uski jagha peh pohoch chuka haina 
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                    // System.out.println(i+Arrays.toString(arr));
                }
            }
            if (swap==false) {
                break;
            }

        }        
        return arr;
    }
   
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        System.out.println(arr.length);
        // System.out.println(arr[5]);
        
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    
}
