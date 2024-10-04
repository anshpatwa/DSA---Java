public class length_LLcycle {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val =val;
            size++;
        }
    }
    length_LLcycle(){
        head=null;
        tail=null;
        size=0;
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if (head==null) {
            newNode =head;
            newNode =tail;
        }
        newNode.next =head;
        head = newNode;
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        if (head==null) {
            head =newNode;
        }
        Node lastNode = head;
        while (lastNode.next !=null) {
            lastNode =lastNode.next;
        }
        lastNode.next =newNode;
        tail =newNode;
        newNode.next =null;
    }
    public void display(){
        Node currNode = head;
        while (currNode !=null) {
            System.out.print(currNode.val+"->");
            currNode=currNode.next;
        }
        System.out.println("End");
    }
    public Node getNode(int Index){
        Node currNode =head;
        for (int i = 1; i < Index; i++) {
            currNode=currNode.next;
        }
        return currNode;
    }
    public void pointtailto(int index){
        Node pointTo = getNode(index);
        tail.next = pointTo;
    }
    public void create_cycle(int oF_Node,int to_Node){
        Node ofNode = getNode(oF_Node);
        Node toNode = getNode(to_Node);
        ofNode.next = toNode; 
    }
    public static Boolean isCycle(Node headNode){
        Node fast = headNode;
        Node slow = headNode;
        while (fast!=null && fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast==slow) {
                    return true;
            }
        }
        return false;
    }
    public static int length_of_LLcycle(Node listhead){
       
        Node fast = listhead;
        Node slow = listhead;
        while (fast!=null && fast.next!=null) {
            fast =fast.next.next;
            slow=slow.next;
            if (fast==slow) {
                int length= 1;
                do {
                    slow=slow.next;
                    length++;
                } while (slow!=fast); 
                return length;
            }
        }
        return 0;
    }
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    public  Node detect_Cyclic_Node(Node listHead){
        Node pointer1= head;
        Node pointer2 = getNode(length_of_LLcycle(listHead));
        while (pointer1!=pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer2;
    }
    public static void main(String[] args) {
        length_LLcycle list = new length_LLcycle();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        
        list.pointtailto(5);
        Boolean iscycle = isCycle(list.head);
        System.out.println(iscycle);
        int length = length_of_LLcycle(list.head); 
        System.out.println(length); // 6 elements ki cycle hai .
        System.out.println(list.detect_Cyclic_Node(list.head).val);
        
        // list.display();
      
        // Trials
        // System.out.println(list.tail.val);
        // System.out.println(list.getNode(3).val);

    }
}
