import java.util.Stack;
// stack is a class in java
public class inbuilt_stack {    //LIFO            // FIFO
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();             
        stack.push(10);                                
        stack.push(90);
        stack.push(40);
        stack.push(25);
        stack.push(70);
        stack.push(50);
        
        System.out.println(stack.pop()); // LIFO
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // while (stack.isEmpty()) {
        //     System.out.println(stack.pop());
        // }
    }
}

/*
 Java Collection framework provides a Stack class that models and implements a Stack data structure. The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search, and peek. The Stack class extends Vector and provides additional functionality specifically for stack operations, such as push, pop, peek, empty, and search. The Stack class can indeed be referred to as a subclass of Vector, inheriting its methods and properties
 */