import java.util.Arrays;
import java.util.Scanner;

public class arrays_2D {
    public static void main(String[] args) {
        /*
            1 2 3 4
            5 6 7 8 
            9 0 1 2
         */
        // int [][] arr = new int[3][];   


        // int [][] arr = {
        //     {1,2,3},
        //     {4,5},              // arr[1][0]-->4     // arr[2][2]-->8
        //     {6,7,8,9},
        // };
            //input
            Scanner sc = new Scanner(System.in);
            int[][] newarr=new int[3][3];
            for(int row=0;row<newarr.length;row++){
                for(int col=0;col<newarr[row].length;col++){
                    newarr[row][col]=sc.nextInt();
                }
            }
                                // 1
                                 
            // for(int row=0;row<newarr.length;row++){
            //     for(int col=0;col<newarr[row].length;col++){
            //         System.out.print(newarr[row][col]+" ");
            //     }
            //     System.out.println();
            // }

                                //2

            // for(int row=0;row<newarr.length;row++){
            //     System.out.println(Arrays.toString(newarr[row]));
            // }    
            
                            // 3
            for(int[]a:newarr){
                System.out.println(Arrays.toString(a));
            }

    }
    
}
