public class check_sortedArray {
    static int i =0;
    public static boolean isSorted(int[] arr){
        if (i>=arr.length-1) {
            i=0;// reset for future calls
            return true;
        }
        if (arr[i]<arr[i+1]) {
            i++;
            return isSorted(arr);
        }
        return false;
    }
    public static boolean isSorted2(int[]arr,int index){
        if (index==arr.length-1) {
            return true;
        }
        return arr[index]<arr[index+1] && isSorted2(arr, index+1);
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,8,9,10};
    System.out.println(isSorted(arr));
    System.out.println(isSorted2(arr, 0));


    int[] arr2={1,2,3,4,5,7,6,9,10};
    System.out.println(isSorted(arr2));
    System.out.println(isSorted2(arr2, 0));
}    
}
