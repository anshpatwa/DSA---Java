public class digit_product {
    static int digit_prod(int num){
        if (num%10 == num){
            return num;
        }
        return (num%10)*digit_prod(num/10);
    }
    public static void main(String[] args) {
        System.out.println(digit_prod(55));
    }
}
