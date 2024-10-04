public class pattern_recursion {
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
        seedha_triangle(4, 0);
    }
}
