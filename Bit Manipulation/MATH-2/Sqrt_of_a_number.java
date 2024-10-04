public class Sqrt_of_a_number {
    // for perfect square 
    public static double perectSqrt(int num,int precision){
        int start=0;
        int end =num;
        double root =0.0;
        while (start<=end) {
        int mid =start+(end-start)/2;  
        if ((mid*mid)==num) {
            return mid;
        }else if (mid*mid>num) {
            end=mid-1;
        }else{
            start=mid+1;
        }
       
        }
        double incr =0.1;
        for(int i=0;i<precision;i++){
            while (root*root<=num) {
                root+=incr;
               
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }

    //a
    public static void main(String[] args) {
         System.out.println(perectSqrt(40, 10));
    }
}
