import java.util.ArrayList;

public class factors {
    public static void factors(int num){
        int start =1;
        while (start<=num) {
            if (num%start==0) {
                System.out.print(start+" ");
            }
            start++;
        }
    }
    public static void optimized_factor(int num){
        ArrayList<Integer> factorlist=new ArrayList<>();
        int start =1;
        while (start<=num/2) {
            if (num%start==0) {
                if (!factorlist.contains(start) && !factorlist.contains(num/start)) {
                    factorlist.add(start);
                    factorlist.add(num/start);
                }
            }
            start++;
        }
        factorlist.sort(null);;
        for(int i:factorlist){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        optimized_factor(20);
    }
}
