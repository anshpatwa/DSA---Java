public class reverse {
    Node head;
    Node tail;
    int size;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next = null;
        }
    }
    reverse(){
        size=0;
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        if (head==null) {
            head=newNode;
            return;
        }
        Node lastNode =head;
        while (lastNode.next!=null) {
            lastNode =lastNode.next;
        }
        lastNode.next = newNode;
        tail=newNode;
        newNode.next=null;
       
    }
    public void display(){
        Node current =head;
        while (current!=null) {
            System.out.print(current.val+"-> ");
            current=current.next;
        }
        System.out.println("END");
    }
    public Node reverse(Node head){
        if (head==null) {
            return head;
        }
        Node previous = null;
        Node present = head;
        Node ahead= present.next;
        while (present!=null) {
            present.next=previous;
            previous =present;
            present=ahead;
            if (ahead!=null) {
                ahead=ahead.next;
            }
        }
        head=previous;
        return previous;
    }
    //    1->2->3->4->5     1->4->3->2->5
    public Node reverseRange(Node head,int left,int right){
        if (left==right || left>right) {
            return head;
        }
        Node previous = null;
        Node current = head;
        for (int i = 1; i < left; i++) {
            previous = current;
            current =current.next;
        }
        Node last=previous;
        Node newEnd = current;
        Node ahead= current.next;
        for (int i = 0; i < right-left+1; i++) {
            current.next =previous;
            previous = current;
            current=ahead;
            if (ahead!=null) {
                ahead=ahead.next;
            }
        }
        if (last!=null) {
            last.next=previous;
        }else{
            head=previous;
        }
        newEnd.next=current;
        return head;
    }
public static void main(String[] args) {
    reverse list1 = new reverse();
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(3);
    list1.addLast(4);
    list1.addLast(5);
    list1.display();
    

    // REVERSE
    // list1.head=list1.reverse(list1.head);
    // list1.display();

    // REVERSE BETWEEN
    list1.head=list1.reverseRange(list1.head, 2, 4);
    list1.display();
}    
}
