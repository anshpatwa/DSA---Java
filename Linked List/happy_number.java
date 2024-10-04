public class happy_number {
    public  boolean ishappy(int num){
       int slow = num;
       int fast =num;
       do {
        fast =findSquare(findSquare(fast));
        slow = findSquare(slow);
       
       } while (slow!=fast);
       if (slow==1) {
        return true;
       }
       return false;
    }
    public int findSquare(int number){
        int ans =0;
        while (number>0) {
        int rem = number%10;
        ans += rem*rem;
        number /=10;
    }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
