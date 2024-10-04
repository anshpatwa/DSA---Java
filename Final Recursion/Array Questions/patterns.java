public class patterns {
    /*
    Pattern -1
    * * * *
    * * *
    * *
    *

    */
    static void  pattern1(int row , int col){
        if (row ==0){return;}
        if (col<row){
            System.out.print("* ");
            pattern1(row,col+1);
        }else{
            System.out.println();
            pattern1(row-1,0);
        }
        }
   /*
    Pattern -2
    *
    * *
    * * *
    * * * *

    */
    static void patter2(int row,int col){
        if (row ==0){return;}
        if (col<row){
            patter2(row,col+1);
            System.out.print("* ");
        }else{
            patter2(row-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(4,0);
        patter2(4,0);
    }
}

