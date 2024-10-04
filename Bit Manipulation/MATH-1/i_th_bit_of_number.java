public class i_th_bit_of_number {
    public static int i_th_bit_of_number(int num,int position){
        // ith =position
        int mask=1<<(position-1);
        int bitvalue=(num&mask)>0?1:0;
        return bitvalue;
    }
    public static int set_bit_to_1(int num,int position){
        int mask =1<<(position-1);
        int bitvalue=(num|mask);
        return bitvalue;
    }
    public static int Reset_bit_to_0(int num,int position){
        int mask=~(1<<(position-1));
        int newnum =(num & mask);
        return newnum;
    }

    public static void main(String[] args) {
        // To Find The I-th Bit Of The Number

        // int i=5;
        // int a =182; // 10110110
        // int b=1<<i-1;      // 00010000
        // int bitvalue=(a&b) > 0?1:0;   // 00010000            // AND
        // System.out.println(a+b);
        // System.out.println(bitvalue);
        System.out.println(i_th_bit_of_number(182, 5));
        


        // Set the I-th Bit to 1            
        // int a =86;  // 1010110                                // OR
        // int b =1<<(4-1);// 0001000
        // System.out.println(a+b); // 1011110 == 94 
        System.out.println(set_bit_to_1(86, 4));


        // Set the I-th Bit to 0
        // int a=86;// 1010110
        // // System.out.println(i_th_bit_of_number(a, 5));
        // int MASK=~(1<<4);//1101111
        // int newnum =(a&MASK);//1000110
        // // System.out.println(i_th_bit_of_number(newnum, 5));
        // System.out.println(newnum);//70
        System.out.println(set_bit_to_0(86, 5));

    }
}
