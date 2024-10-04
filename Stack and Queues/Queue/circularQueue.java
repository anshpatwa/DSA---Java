public class circularQueue {
    int[] data;
    protected static final int defaul_size =10;

    protected int front =0;
    protected int end =0;
    private int size =0;

    public circularQueue(){
        this(defaul_size);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean insert(int item){
        if (isFull()) {
            return false;
        }
        data[end]=item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed =data[front];
        front++;
        front =front%data.length;
        size--;
        return removed;
    }
    public void display(){
        // if (isEmpty()) {
        //     System.out.println("Empty");
        //     return;
        // }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        queue.insert(6);
        queue.display();

    }
}
