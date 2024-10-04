public class palindrom extends Reverse_a_Number {
    static boolean check(int num){
        return num ==reverse2(num);
    }
    static boolean check2(int num){
        int rev = helper(num,0);
        if (rev==num){
            return true;
        }
        return false;
    }
    static int helper(int num , int temp ){
        if (num==0){return temp;}
        temp = (temp*10) +(num%10);
        return helper(num/10,temp);
    }


    public static void main(String[] args) {
        System.out.println(check2(123321));
    }
}
