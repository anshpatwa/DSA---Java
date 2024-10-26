public class Pow_x_n {
    static double myPow(double x , int n){
        return binary(x,(long)n);
    }
    static double binary(double x, long n){
        if (n==0){return 1;}
        if (n<0){
            return 1.0/binary(x,-n);
        }
        if (n%2==1){
            return x*binary(x*x,(n-1)/2);
        }else{
            return binary(x*x,n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.10,3));
    }
}
