public class OddEven {
    public static boolean isodd(int n){
        return (n&1)==1;
        // cannot use zero because And me woh 1 ko bhee 0 krdega.or fhir last wala bit hamesha 0 hi raheyga toh TRUE aayega output me.
        // motive yeh hai ko jo 1 hai woh 1 rahe or jo 0 hai woh 0 rahe.
    }
    public static void main(String[] args) {
        System.out.println(isodd(2));
        int num=10;
        System.out.println(Integer.toBinaryString(num));
    }
    
}
