public class number_of_steps_to_reduce_to_zero {
    static int count =0;
    public static int numberofsteps(int num){
        if (num==0) {
            return count;
            
           }
        if (iseven(num)) {
            num=num/2;
            count++;
            return numberofsteps(num);
       }else if (!iseven(num)) {
            num--;
            count++;
            return numberofsteps(num);
       }
      
       return -1;
    }
    public static boolean iseven(int num){
       return num%2==0;
    }
    public static int simple(int num){
        if (num==0) {
            return 0;
        }
        if (iseven(num)) {
            return 1+simple(num/2);
        }else{
            return 1+simple(num-1);
        }
    }
 public static void main(String[] args) {
    int ans = simple(123);
    System.out.println(ans);
    int ans2 = numberofsteps(123);
    System.out.println(ans2);
 }   
}
