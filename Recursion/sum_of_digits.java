public class sum_of_digits {
    public static int sum_of_digits(int num){
        if (num ==0) {
            return 0;
        }
        return (num%10)+sum_of_digits(num/10);
    }
    public static int prod_of_digits(int num){
        if (num%10 ==num) {
            return num;
        }
        return (num%10)*prod_of_digits(num/10);
    }
    public static void main(String[] args) {
       int ans =sum_of_digits(1342);
       System.out.println(ans); 
       int ans2=prod_of_digits(55);
       System.out.println(ans2);
    }
}
