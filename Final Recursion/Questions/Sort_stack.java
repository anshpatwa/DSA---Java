import java.util.ListIterator;
import java.util.Stack;

public class Sort_stack {
    static void sortedInsert(Stack<Integer> s, int x){
        if (s.isEmpty() || x>s.peek()){
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s,x);
        s.push(temp);
    }
    static void sortstack(Stack<Integer> s){
        if (!s.isEmpty()){
            int x = s.pop();
            sortstack(s);
            sortedInsert(s,x);
        }
    }
    static void printstack(Stack<Integer> s){
        ListIterator<Integer> lt = s.listIterator();
        while(lt.hasNext())
            lt.next();
            while (lt.hasPrevious())
                System.out.print(lt.previous()+"-->");


    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(90);
        s.push(30);
        s.push(70);
        s.push(20);
        s.push(10);
        s.push(50);
        printstack(s);
        sortstack(s);
        System.out.println("Sorted");
        printstack(s);
        sortedInsert(s,40);
        System.out.println("element added");
        printstack(s);
    }
}
