import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/
public class MyQueue {
    Stack<Integer> first,second;
    public MyQueue() {
    first = new Stack<>();
    second = new Stack<>();
    }

    public void add(int x) {
    first.push(x);
    }

    public int remove() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
    while (!first.isEmpty()){
        second.push(first.pop());
    }
    int peeked = second.peek();
    while (!second.isEmpty()) {
        first.push(second.pop());
    }
    return peeked;
    }

    public boolean isEmpty() {
    return first.isEmpty();
    }

}
