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
    static void mergesortInPlace(int[]arr, int s, int e){
        if (e-s==1){return;}
        int mid = (s+e)/2;
        mergesort(Arrays.copyOfRange(arr,s,mid));
        mergesort(Arrays.copyOfRange(arr,mid,e));
        mergeInPlace(arr,s,mid,e);
    }
    static void mergeInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int ptr1 =s;
        int ptr2= m;
        int ptr3 =0;
        while (ptr1<m && ptr2 <e ){
            if (arr[ptr1]<arr[ptr2]){
                mix[ptr3] = arr[ptr1];
                ptr1++;
            }else{
                mix[ptr3] =arr[ptr2];
                ptr2++;
            }
            ptr3++;
        }
        while (ptr1<m){
            mix[ptr3] = arr[ptr1];
            ptr1++;
            ptr3++;
        }
        while (ptr2<e){
            mix[ptr3] = arr[ptr2];
            ptr2++;
            ptr3++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

        // merge in place
        mergesortInPlace(arr,0,arr.length);
        System.out.println("Merge in Place");
        System.out.println(Arrays.toString(arr));
    }
}
