public class factorial {
    static int factorial(int num){
        if (num<=2){
            return num;
        }
        int facto = num * factorial(num-1);
        return facto;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

    }
}
