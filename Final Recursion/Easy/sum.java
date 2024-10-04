public class sum {
    static int sum(int num){
        if (num<2){
            return num;
        }
        int total_sum = num +sum(num-1);
        return total_sum;
    }
    static int sum_range(int start,int end){
        if (start==end){
            return end;
        }
        int sumRange = start+sum_range(start+1,end);
        return sumRange;
    }
    public static void main(String[] args) {
        System.out.println(sum(5)); // 1+2+3+4+5+6+7+8+9+10
        System.out.println(sum_range(100,150));
    }
}
