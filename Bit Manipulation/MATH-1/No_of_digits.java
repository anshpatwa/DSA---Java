public class No_of_digits {
    /*
       FIND THE NUMBER OF DIGITS IN BASE-B.
    (6)10 = 1 digit
    (6)10 = (110)2 = 3 digit
    (2)10 = (10)2=2 digits
     */
    public static int method1(int num){
        int count=0;
        while (num>0) {
            num=num>>1;
            count++;
        }
        return count;
    }
    public static int method2(int num,int base){
        // base for deccimal =10 , for binary =2
        int ans=(int)(Math.log(num)/Math.log(base))+1;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(method1(66));
        System.out.println(method2(66, 2));
        System.out.println(method2(123456789, 10));
    }
}
