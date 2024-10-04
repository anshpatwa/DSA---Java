import java.util.ArrayList;

public class prime_number {
    public static boolean checkPrime(int num){
        int start=2;
        while (start<=Math.sqrt(num)) {
            if (num%start==0) {
                return false;
            }
            start++;
        }
        return true;
    }
    public static void primeRange(int num,boolean[]prime){
       
       for(int i =2;i<=Math.sqrt(num);i++){
            if (!prime[i]) {
                for(int j=i*2;j<=num;j=i+j){
                    prime[j]=true;
                }
            }
       }

       for(int i=2;i<=num;i++){
        if (!prime[i]) {
            System.out.print(i+" ");
        }
       }
    }
    public static void main(String[] args) {
        // int num =20;
        // System.out.println(checkPrime(num));
        // for(int i=1;i<=num;i++){
        //     System.out.println(i+" "+"is:"+checkPrime(i));
        // }
        int num=40;
        boolean[] prime = new boolean[num+1];
        primeRange(num, prime);
    }
}
/* 
  .              WHY SQRT IS USED ??
              
 to check 36
 factors:-
 1  *  36
 2  *  18
 3  *  12
 4  *  9
 6  *  6
.    --> digits below this are the repetation of vice-versa. so the max element till where we need to check is sqrt(36) i.e =6.
 9  *  4
 12 *  3
 18 *  2
 36 *  1
 */