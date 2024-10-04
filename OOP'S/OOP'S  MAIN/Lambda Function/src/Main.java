
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    private int operate(int a,int b,operations op){
        return op.operators(a,b);
    }
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(i);
        }
//        list.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        System.out.println(fun);
        operations sum = (a,b) -> a+b;
        operations prod = (a,b) -> a*b;
        operations sub = (a,b) -> a-b;

        Main mycalculator = new Main();
        System.out.println(mycalculator.operate(5,3,sum));
        System.out.println(mycalculator.operate(5,3,prod));
        System.out.println(mycalculator.operate(5,3,sub));

    }
}
interface operations{
    int operators(int a,int b);
}