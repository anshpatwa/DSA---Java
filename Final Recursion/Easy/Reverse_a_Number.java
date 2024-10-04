public class Reverse_a_Number {
    static int reversed =0;
    static int reverse(int num){
        if (num==0){
            return reversed;
        }
        int rem = num%10;
        reversed = reversed *10 + rem;
        return  reverse(num/10);
    }
    static int reverse2(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num,digits);
    }

    private static int helper(int num, int digits) {
        if (num%10==num){return num;}
        int rem = num%10;
        return (int) (rem *Math.pow(10,digits-1) +helper(num/10,digits-1)); // 50000+4000+300+20+1
    }

    static int rev(int num , int temp){
        if (num==0){return temp;}
        temp = (temp*10) + (num%10);
        return rev(num/10,temp);

    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
        System.out.println(reverse2(12345));
        System.out.println((int)Math.log10(123456789)+1); // this gives us the no. of digits in a number
        System.out.println(rev(12345,0));
    }
}
