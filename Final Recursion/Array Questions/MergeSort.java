import java.util.Arrays;

public class MergeSort {
    static int[] mergesort(int[]arr){
        if (arr.length==1){return arr;}
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first ,int[] second){
        int[] mix = new int[first.length+ second.length];
        int ptr1 =0;
        int ptr2= 0;
        int ptr3 =0;
        while (ptr1<first.length && ptr2 <second.length ){
            if (first[ptr1]<second[ptr2]){
                mix[ptr3] = first[ptr1];
                ptr1++;
            }else{
                mix[ptr3] =second[ptr2];
                ptr2++;
            }
            ptr3++;
        }
        while (ptr1<first.length){
            mix[ptr3] = first[ptr1];
            ptr1++;
            ptr3++;
        }
        while (ptr2<second.length){
            mix[ptr3] = second[ptr2];
            ptr2++;
            ptr3++;
        }
        return mix;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
