public class L_search2D {
    public static void main(String[] args) {

        // Array
        int[][] array={{1,2,3,4,5},
                    {6,7,8,9,10,},
                    {11,12,13,14,15}};

        // Searching The Element


        //Method 1
        int target=15;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if (array[i][j]==target) {
                    System.out.println("fount the element at:"+"["+i+"]"+"["+j+"]");
                }
            }
        }
        //Method 2
        for(int[]arr:array){
            for(int element2:arr){
                if (element2==target) {
                    System.out.println("found");    // this method does n't print the row and col no.
                }
            }
        } 


        //Maximum Element


        //Method 1
        int max=array[0][0];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if (array[i][j]>max) {
                    max=array[i][j];
                }
            }
        }
        System.out.println(max);
        //Method 2
        for(int[]ints:array){
            for(int element:ints){
                if (element>max) {
                    max=element;
                }
            }
        }
        System.out.println(max);
       

    }
    
}
