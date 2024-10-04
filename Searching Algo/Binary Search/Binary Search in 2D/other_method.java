import java.util.Arrays;

public class other_method {
    public static int searchRow(int[][] matrix,int target){
        if (matrix==null || matrix.length ==0 || matrix[0].length==0) {
            return  -1;
        }
        // searching the suitable row
        int start =0;
        int row= -1;
        int end=matrix.length-1;
        while (start<=end) {
            int mid= start+(end-start)/2;
            if (matrix[mid][0]<=target && matrix[mid][matrix[mid].length-1]>=target) {
                row=mid;
                break;
            }else if (matrix[mid][0]>target) {
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return row;
    }

    public static int[] serachElement(int[][] matrix,int target){
        // searching in row
        int row=searchRow(matrix, target);
        int start2=0;
        int end2=matrix[row].length-1;
        while (start2<=end2) {
            int mid =start2+(end2-start2)/2;
            if (matrix[row][mid]==target) {
                return new int[]{row,mid};
            }else if (matrix[row][mid]>target) {
                end2=mid-1;
            }else{
                start2=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        int[][] matrix = {// row wise sorted
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(serachElement(matrix, 50)));
    }
}
