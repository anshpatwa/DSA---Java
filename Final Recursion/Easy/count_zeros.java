public class count_zeros {
    static int count(int num){
        return helper(num , 0);
    }
    static int helper(int num, int counter){
        if (num==0){
            return counter;
        }
        int rem = num%10;
        if (rem==0){
            counter++;
        }
        return helper(num/10,counter);
    }
    public static void main(String[] args) {
        System.out.println(count(12345));
    }
}
