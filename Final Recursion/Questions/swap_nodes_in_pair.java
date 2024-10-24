public class swap_nodes_in_pair {
    Node head;
    Node tail;
    private int size;
    swap_nodes_in_pair(){
        size =0;
    }
    public class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val=val;
            this.next=null;
            size++;
        }
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if (head==null) {
            newNode.next=head;
            tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public void addLast(int val){
       Node newNode = new Node(val);
        if (head==null) {
            head=newNode;        //
            return;
        }
        Node lastNode=head;
        while (lastNode.next!=null) {
            lastNode= lastNode.next;
        }
        lastNode.next =newNode;
        tail=lastNode;
    }
    public void printList(){
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.val+"-> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public Node swapPairs(Node head){
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev = dummy;
        Node  cur = head;
        while(cur !=null && cur.next !=null){
            Node second = cur.next;
            Node nextpair = cur.next.next;

            second.next = cur;
            cur.next = nextpair;
            prev.next = second;
            // moving the pointer forward
            prev= cur;
            cur= nextpair;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        swap_nodes_in_pair list = new swap_nodes_in_pair();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
       list.head = list.swapPairs(list.head);
       list.printList();
    }
}
