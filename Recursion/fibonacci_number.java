public class fibonacci_number {
    //  0  1  1  2  3  5  8  13  21  34  55  89

    /*
      RECURSION POINTS
    1 --> identify if you can break problem into smaller problems
    2 --> write the reoccurence relation if needed.
    3 --> draw the recursive tree
    4 --> about the tree
        1 --> see the flow of function ,how they are getting in stack.
        2 -->identify the flows of left tree calls and right tree calls.
    5 --> see how values are returned at each step.
    6 --> set a proper base condition.
     */
    public static int fibo(int n){
        
        if (n<2) {   // isse 1 peh 1 return krdega or 0 peh 0
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
      System.out.println(fibo(2));
    }
}
