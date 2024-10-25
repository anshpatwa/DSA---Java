public class Broken_Calculator {
    static int brokencalc(int startValue, int target) {
        if (startValue >= target) return startValue - target;
        if (target % 2 == 0) {
            return 1 + brokencalc(startValue, target / 2);
        }
        return 1 + brokencalc(startValue, target + 1);

    }
    public static void main(String[] args) {

        System.out.println(brokencalc(3,10));
    }
}
