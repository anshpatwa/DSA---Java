public class custom_stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public custom_stack(){
        this(DEFAULT_SIZE);
    } 
    public custom_stack(int size){
        this.data = new int[size];
    }
    public boolean push(int val){
        if (isFull()) {
            return false;
        }
        ptr++;
        data[ptr]=val;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot PoP from Empty Stack");
        }
        return data[ptr--];// execution ke baad karega --
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Cannot Peek an EMpty Stack");
        }
        return data[ptr];
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean isFull(){
        return ptr ==data.length-1;
    }
    public static void main(String[] args) throws Exception {
        custom_stack stack = new custom_stack(5);
        stack.push(10);
        stack.push(99);
        stack.push(19);
        stack.push(11);
        stack.push(73);
        // stack.push(100);// error cause of size 
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // doubling the size of stack 
        System.out.println("Stack 2:-");
        dynamicStack stack2 = new dynamicStack(2);
        // size=2
        stack2.push(19);
        stack2.push(29);
        stack2.push(39);  // 3rd element
        System.out.println(stack2.pop());
        System.out.println(stack2.pop());
        System.out.println(stack2.pop()); // still works cause of dyanmicStack
       
    }
}
