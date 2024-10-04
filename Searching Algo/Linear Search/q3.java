public class q3 {
    static boolean present(int[][] arr,int target){
        boolean present=false;
        for(int[] i:arr){
            for(int j:i){
                if (target==j) {
                    present= true;
                }
            }
        }
        return present;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(present(matrix, 5));
    }
}
