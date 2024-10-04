public class understandCLL {
    private Node head;
    private Node tail;
    private int size =0;
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data =data;
            next=null;
            size++;
        }
    }
    understandCLL(){
        size =0;
        head=null;
        tail=null;
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next=head;
            head = newNode;
            tail=head;
            return;
        }
        newNode.next = head;
        head= newNode;
    }
    public void printLL(){
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.data+"-> ");
            curNode=curNode.next;
        }
        System.out.println("Null");
    }
    public Node getNode(int index){
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode =currNode.next;
        }
        return currNode;
    }
    public void delet(int index){
        Node curNode = getNode(index-1);
        curNode.next = getNode(index+1);

    }
    public static void main(String[] args) {
        understandCLL list = new understandCLL();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        // System.out.println(list.head.data);
        list.delet(2);
        list.printLL();
    }
}
