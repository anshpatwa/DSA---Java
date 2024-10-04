/*
  I-th           5^3        5^2        5^1       ---->     Magic Num
  
  1               0          0          1        ---->     5

  2               0          1          0        ---->    25

  3               0          1          1        ---->    30

  4               1          0          0        ---->    125

  5               1          0          1        ---->    130
  .
  .
  .
  n?

 */


public class magic_number {
    public static void main(String[] args) {
        int n =2;
        int ans=0;
        int base=5;
        while (n>0) {
            int last =n&1;
            n=n>>1;
            ans +=last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
