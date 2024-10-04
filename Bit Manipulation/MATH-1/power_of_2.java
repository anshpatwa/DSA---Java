/*
  2^n =X
  find n ?

  2=10       --> n=1
  4=100      --> n=2
  8=1000     --> n=3
  16=10000   --> n=4
  32=100000  --> n=5

 n is equal to the number of zeros.

 */
public class power_of_2 {
    public static int power_of_2(int num){
        int count =0;
        while (num>0) {
        if ((num & (num-1))!=0) {
            System.out.println("not a powe of 2");
            break;
        }
        if ((num & 1)==1) {
            break;
        }else{
            num =num>>1;
            count++;
        }
        }
        
        return count;
    }
   public static void main(String[] args) {
    System.out.println(power_of_2(128));
   } 
}
