public class Pattern {
    /*

    * * * *
    * * *
    * *
    *

     */
    public static void triangle1(int row,int col){
        if (row==0) {
            return;
        }
        if (col<row) {
            System.out.print("* ");
            triangle1(row, col+1);
        }else{
            System.out.println();
            triangle1(row-1, 0);
        }
    }
    
    /*

     *
     * *
     * * *
     * * * *
     
     */
    public static void triangle2(int r,int c){
        if (r==0) {
            return;
        }
        if (c<r) {
            triangle2(r, c+1);
            System.out.print("* ");
        }else{
            triangle2(r-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle1(4, 0);
        triangle2(4, 0);
        
    }
}
