public class sum_of_a_digit {
   static int sum =0;
    static int sumDigit(int num){
        if (num==0) {
            return sum;
        }
        int digit = num%10;
        sum += digit;
        return sumDigit(num/10);
    }
    // Simpler one
    static int digitsum(int num){
        if (num==0){
            return 0;
        }
        return (num%10)+digitsum(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sumDigit(1342));
        System.out.println(digitsum(1342));
    }
}
