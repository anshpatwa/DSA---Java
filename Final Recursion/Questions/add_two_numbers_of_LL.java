public class add_two_numbers_of_LL {
    Node head;
    Node tail;
    private int size;
    add_two_numbers_of_LL(){
        size=0;
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
    public Node addtwonumbers(Node l1, Node l2){
        Node dummynode = new Node(0);
        Node tail = dummynode;
        int carryover = 0;
        while(l1!=null || l2!= null || carryover!=0){
            int digit1 = (l1!=null) ? l1.val:0;
            int digit2 = (l2!=null) ? l2.val:0;
            int sum = digit1+digit2+carryover;
            int digit = sum%10;
            carryover =sum/10;
            Node newNode = new Node(digit);
            tail.next = newNode;
            tail = tail.next;
            l1 = (l1!=null) ? l1.next:null;
            l2 = (l1!=null) ? l2.next:null;
        }
        Node result = dummynode.next;
        dummynode.next=null;
        return result;

    }
    public static void main(String[] args) {
        add_two_numbers_of_LL list1 = new add_two_numbers_of_LL();
        list1.addLast(2);
        list1.addLast(4);
        list1.addLast(3);
        add_two_numbers_of_LL list2 = new add_two_numbers_of_LL();
        list2.addLast(5);
        list2.addLast(6);
        list2.addLast(4);
        add_two_numbers_of_LL list3 = new add_two_numbers_of_LL();
        list3.head = list3.addtwonumbers(list1.head,list2.head);
        list3.printList();
    }
}
