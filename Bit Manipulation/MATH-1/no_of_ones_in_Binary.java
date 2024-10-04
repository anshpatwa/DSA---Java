public class no_of_ones_in_Binary {
    public static int numberof1_s(int num){
        int count =0;
        while (num>0) {
            count++;
            num-=(num&-num);  // Iteration -1 . 45 -(45&-45) == 101100 , isse rightest wala 1 hut gya.   1
            // iteration 2 . 101100 -(101100 & 010100)  == 101000       2
            // iteration 3 . 101000 -(101000 & 010100)  == 100000       3
            // iteration 4 . 100000 -(100000 & 100000)  == 0            4
        }

        // while (num>0) {
        //     count++;
        //     num=num&(num-1); // if you ever minus (n-1) from n then 1 from binary number of n from rightest side is removed.
        // }
        return count;
    }
    public static void main(String[] args) {
        int n =45;
        System.out.println(numberof1_s(n));
        System.out.println(Integer.toBinaryString(n));
    }
}
