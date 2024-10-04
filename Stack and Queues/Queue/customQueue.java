public class customQueue {
    private int[] data;
    private static final int defaul_size = 10;
    int end =0;
   
    public customQueue(){
        this(defaul_size);
    }
    public customQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end ==0;
    }
    public boolean insert(int item){
        if (isFull()) {
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int removed() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue Is Empty");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }
    public int front(){return data[0];}
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+"->");
        }
        System.out.println("End");
    }

    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.display();
        queue.removed();
        queue.display();



        // System.out.println(queue.removed());
        // System.out.println("Front Itme: "+queue.front());




        // System.out.println(queue.removed());
        // System.out.println(queue.removed());
        // System.out.println(queue.removed());
        // System.out.println(queue.removed());

    }
}
