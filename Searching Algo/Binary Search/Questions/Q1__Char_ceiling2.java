import java.util.Arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1238278995/
public class Q1__Char_ceiling2 {
    static char ceiling(char[]arr,char target){
        if (target>arr[arr.length-1]) {
            return arr[0];
        }
        int start =0;
        int end =arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start =mid+1;
            }else{
                start=mid+1;
                break;
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        char[] arr ={'x','x','y','y'};
        System.out.println(Arrays.toString(arr));
        char target ='z';
        char ans = ceiling(arr, target);
        System.out.println(ans);
    }
    
}
