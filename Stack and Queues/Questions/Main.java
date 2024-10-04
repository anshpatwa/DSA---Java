public class Main {
    public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    queue.add(6);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
