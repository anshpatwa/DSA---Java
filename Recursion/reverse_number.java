public class reverse_number {
    static int sum=0;
    public static int reverse_number(int num){
        if (num==0) {
            int result = sum;
            sum =0;// reset for future calls
            return result;
        }
        int lastdigit = (num%10);
        sum*=10; 
        sum +=lastdigit;
        
       
        return reverse_number(num/10);
    }
    public static int rev2(int num){ // galat hai yr yeh
        int digits =(int)(Math.log10(num))+1;
        return helper(num,digits);
    }
    public static int helper(int num,int digits){
        if (num%10==num) {
            return num;
        }
        int rem =num%10;
        return rem*(int)(Math.pow(10, digits-1)+helper(num/10, digits-1));
    }
    public static void main(String[] args) {
        int ans=reverse_number(1824);
        System.out.println(ans);
        int ans2=reverse_number(12345);
        System.out.println(ans2);

        System.out.println(rev2(4567));
    }
}
