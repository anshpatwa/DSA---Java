public class customSinglyLL {
    private Node head;
    private Node tail;
    private int size;
    public customSinglyLL(){
        this.size =0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        head = node;
        if (tail==null) {
            tail=head;
        }
        size +=1;
    }
    public void display(){
        Node temp =head;   
        while (temp!=null) {
            System.out.print(temp.value+" -> ");
            temp =temp.next;
        }
        System.out.println("END");
    }
private class Node{
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }
    public Node(int value , Node Next){
        this.value =value;
        this.next = next;
    }
}
    public static void main(String[] args) {
        customSinglyLL list = new customSinglyLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
        
    }
}

// Asli maal understandingLL me hai.