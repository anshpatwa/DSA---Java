public class Fibonacci_Number {
    static int fibo(int position){
        if (position<2){
            return position;
        }
        return fibo(position-1)+fibo(position-2);
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));

    }
}
