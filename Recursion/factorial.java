public class factorial {
    public static int factorial(int num){
        if (num==0) {
           return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        double a =2.0;
        double b =4.0;
    System.out.println(Math.pow(a, b));;
    }
}