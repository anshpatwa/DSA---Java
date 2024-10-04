public class rough23 {
    public static int findSquare(int number){
        int ans =0;
        while (number>0){
            int rem = number %10;
            ans += rem*rem;
            number /=10;
        }
        return  ans;
    }

    public static void main(String[] args) {
        int square = findSquare(4);
        System.out.println(square);
    }
}
