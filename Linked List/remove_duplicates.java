public class remove_duplicates {
    Node head;
    Node tail;
    int size=0;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
            size++;
        }
    }
    remove_duplicates(){
        size=0;
        head=null;
        tail=null;
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if (head==null) {
            head=newNode;
            tail=newNode;
        }else{
        newNode.next =head;
        head =newNode;
        }
    
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        if (head==null) {
         head=newNode; 
               // 
         return;
        }
        Node lastNode=head;
        while (lastNode.next!=null) {
         lastNode= lastNode.next;
        }
        lastNode.next =newNode;
        tail=newNode;
     }
    public void display(){
        Node currNode = head;
        if (head==null) {
            System.out.println("Empty hai List");
        }
        while (currNode!=null) {
            System.out.print(currNode.val+"-> ");
            currNode = currNode.next;
        }
        System.out.println("End");
    }
    public void removeDuplicates(){
        if (head == null || head.next == null) {
            return;
        }
        Node currNode =head;
        Node moveNode =head.next;
        while (moveNode.next!=null) {
           if (currNode.val == moveNode.val) {
            moveNode = moveNode.next;
            size--;
           }else{
            currNode.next=moveNode;
            currNode =currNode.next;
           }
        }
        tail=currNode;
        tail.next=null;
    }
    public Node deleteDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        remove_duplicates list = new remove_duplicates();
        list.addLast(100);
        list.addLast(100);
        list.addLast(100);
        list.addLast(200);
        list.addLast(200);
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addLast(400);
        list.addLast(400);
        list.addLast(500);
        System.out.println(list.tail.val);
        list.removeDuplicates();
        // System.out.println(list.head.next.val);
        list.display();
    }
}
