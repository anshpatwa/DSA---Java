public class count_zeros {
    static int count =0;
    public static int counter(int num){
        if (num==0) {
            return count;
        }
        int remainder = num%10;
        if (remainder ==0) {
            count++;
        }
        return counter(num/10);
    }
    public static void main(String[] args) {
        int ans = counter(1000050000);
        System.out.println(ans);
    }
}
