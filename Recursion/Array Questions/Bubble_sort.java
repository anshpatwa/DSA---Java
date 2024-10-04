import java.util.Arrays;

public class Bubble_sort {
    public static void bubble(int[] arr,int r,int c){
        if (r==0) {
           return;
        }
        if (c<r) {
            if (arr[c]>arr[c+1]) {
                int temp =arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }
    public static void seedha_triangle(int row,int col){
        if (row==0) {
            return;
        }
        if (col<row) {
            seedha_triangle(row, col+1);
            System.out.print("* ");
            
        }else{
            seedha_triangle(row-1, 0);
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        seedha_triangle(4, 0);
    }
}
// bhai yeh purra program reverse me work krta hai . isko samaj lo purra recurssion samaj aa jayega .