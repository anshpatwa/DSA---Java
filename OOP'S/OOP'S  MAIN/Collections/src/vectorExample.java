import java.util.List;
import java.util.Vector;

public class vectorExample {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();

        vector.add(3824);
        vector.add(837);
        vector.add(324);
        vector.add(9234);
        System.out.println(vector);
    }
}
/*
Vector is synchronized and ArrayList isn't. size growth – Another difference between the two is the way they resize while reaching their capacity. The Vector doubles its size. In contrast, ArrayList increases only by half of its length.
 */