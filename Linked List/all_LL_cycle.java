public class all_LL_cycle {
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
    all_LL_cycle(){
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
         head=newNode;        // 
         return;
        }
        Node lastNode=head;
        while (lastNode.next!=null) {
         lastNode= lastNode.next;
        }
        lastNode.next =newNode;
        tail=newNode;
        newNode.next =null;
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
    public Node getNode(int index){
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode =currNode.next;
        }
        return currNode;
    }
    public void pointtailto(int index){
        Node curNode = getNode(index);
        tail.next = curNode;
    }
    public void create_cycle(int oF_Node,int to_Node){
        Node ofNode = getNode(oF_Node);
        Node toNode = getNode(to_Node);
        ofNode.next = toNode; 
    }
    //https://leetcode.com/problems/linked-list-cycle/description/
   public boolean hasCycle(all_LL_cycle list){
    if (head == null || head.next == null) {
        return false; // Empty list or single node
    }
    Node slow = head;
    Node fast = head;
    while (fast !=null && fast.next != null) {  // dono me se ek bhee false to exit loop;
        fast = fast.next.next;
        slow = slow.next;
        if (fast==slow) {
            return true;
        }
    }
    return false;
   }
   public int length_cycle_LL(Node head){
    Node fast = head;
    Node slow = head;
    while (fast!=null && fast.next !=null) {
        fast = fast.next.next;
        slow = slow.next;
        if (fast == slow) {
            Node temp = slow;
            int length =0;
            do {
                temp = temp .next;
                length++;       // fromcode peh initial_lenght =1; uske baad fromNode ek bar or end me bhee count hota hai cause of do-while loop.ya toh tum do{}while(slow.next)!=null krdo ya fhir int length =0;
            } while (temp!=slow);
            return length;
        } 
    }
    return 0;
}
//https://leetcode.com/problems/middle-of-the-linked-list/description/
// Method 1
    public Node middleNode(Node listhead){  // return the middle node of the list.
     Node slow = head;
     Node fast = head;
     while (fast!=null && fast.next!=null) {
        slow =slow.next;
        fast =fast.next.next;
     }
     return slow;
}
// Method 2
    public Node getMid(Node listhead){
        Node midPrev = null;
        while (head!=null && head.next !=null) {
            midPrev = (midPrev==null)?head:midPrev.next;
            head = head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next =null;
        return mid;
    }
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
public  Node detect_Cyclic_Node(Node listHead){
    Node pointer1= head;
    Node pointer2 = getNode(length_cycle_LL(listHead));
    while (pointer1!=pointer2) {
        pointer1 = pointer1.next;
        pointer2 = pointer2.next;
    }
    return pointer2;
}
    public static void main(String[] args) {
        all_LL_cycle list = new all_LL_cycle();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        // list.addLast(60);
        // System.out.println(list.getMid(list.head).val);
        System.out.println(list.middleNode(list.head).val);
        // list.pointtailto(5);
        // System.out.println("Size:"+list.size);
        // int length = list.length_cycle_LL(list.head);
        // System.out.println(length);
        // list.tailTo(2);
        // System.out.println(list.getNode(3).val);
        // System.out.println(list.hasCycle(list));
        // list.display();
    }
}

