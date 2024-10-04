public class numberOfSteps {
    static int stepscount(int num){
        if (num==0){ return 0;}
        if (iseven(num)){
            return 1+stepscount(num/2);
        }
        return 1+stepscount(num-1);
    }
    static boolean iseven(int num){
        return num%2==0;
    }

    public static void main(String[] args) {
        System.out.println(stepscount(123));
    }
}
