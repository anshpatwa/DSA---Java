public class understandingLL {
    Node head; // head and next are reference variable for the objects of Node class. they cannot refer to anyother object of another class.
    Node tail;
    // we need only one head hence initializes outside the class .
    // Node isliye likha hai phele kyuki yeh reference sirf ek node(object of node class) ko hi refer karega kisi or cheese ko nhi.
    private int size;
    understandingLL(){
        size =0;
        head=null;
        tail=null;
    }

    public class Node { // yeh static nhi hai toh outter class ke object se access kr sktte ho isse sirf 
        String data;
        Node next; // we want every node to have next reference ,hence it is declared inside the classs.
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);          
        newNode.next =head;  // newnode[next] ->head->NEWNODE[next]   // head sirf ek reference hai.
        head=newNode;    // head -> newnode[next] ->NEWNODE[next]
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null) {
           head=newNode;   // agar isko newNode.next krdunga toh newNode ki default nextt value to null hai .
            return; 
        }
        Node lastNode =head;   // head is starting node se traverse krne ke liye use hua hai.
        while (lastNode.next!=null) {
            lastNode = lastNode.next;
        } 
        lastNode.next=newNode;
    }
    public void addAnyWhere(String data,int index){
        if (index==1) {
            addFirst(data);
            return;
        }
        if (index==size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node currNode = head;
        Node aheaNode =head.next;
        for (int i = 1; i <index-1; i++) { // kyuki 1st node peh toh already hai hi.
            currNode = currNode.next;
            aheaNode =aheaNode.next;
            
        }
        currNode.next = newNode;
        newNode.next =aheaNode;
        
    }
    public void printList(){
        Node currNode = head;// currNode && head  --> points to the same node. currNode is simply a reference variable for Nodes
        while (currNode!=null) {// if currNode.next!=null karo toh ? fhir yeh last node peh jayega or uski value print krne ki jagha yeh print krdega NULL.
            System.out.print(currNode.data+"-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public void size(){
        System.out.println("Size: "+size);
    }
    public void removeFirst(){
        if (head==null) {
            System.out.println("Empty hai.");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if (head==null) {
            System.out.println("Empty hai");
            return;
        }
        if (head.next==null) {
            head=null;
            return;
        }
        Node curNode =head;   // starts from the first Node i.e Head node
        Node lastNode = head.next;  // Starts from second Node i.e head.next node
       
        while (lastNode.next!=null) { // yeh last node peh jaake rukhega[D] . nah ki Null peh.ā
            curNode = curNode.next; // yeh lastNode se ek lag krta hai.
            lastNode = lastNode.next;
        }
        curNode.next=null;
        size--;
    }
    public void findinLL(String data){
        int index =1;
        Node currNode = head;
        while (!(currNode.data).equals(data)) {
            currNode =currNode.next;
            index++;
        }
        System.out.println("Index: "+index);
    }
    public Node getNode(int index){
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode =currNode.next;
        }
        return currNode;
    }
     // Reversely Linked 

   // Method 1 - recursion calls
   private void reverse(Node node){
    if (node==tail) {
      head=tail;
      return;  
    }
    reverse(node.next);
    tail.next =node;
    tail=node;
    tail.next=null;
   }
   // Method 2 - In place reversal of Linked List
        //     without recurssion and tail
   public Node reverse2(Node head){
    Node previous = null;
    Node presentNode=head;
    Node aheadNode = presentNode.next;
    while (presentNode!=aheadNode) { // pr (presentNode !=null)
        presentNode.next = previous;
        previous = presentNode;
        presentNode = aheadNode;
        if (aheadNode!=null) {
            aheadNode = aheadNode.next;
        } 
    }
        head=previous;
        return previous;
   }
   // reverseBetween hai practiceLL me.

    public static void main(String[] args) {
        understandingLL list = new understandingLL();
        // list.addFirst("A");
        // list.addFirst("B");
        // list.addFirst("C");
        // list.addFirst("D");
        
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");
        list.addLast("D");
        
        System.out.println("HEAD: "+list.head.data);
        // list.addAnyWhere("z", 3);
        // list.addLast("Y");
        // list.removeFirst();
        // list.removeLast();
        list.printList();
    //     list.size();
    //     list.findinLL("D");
     list.head = list.reverse2(list.head);
     list.printList();
  
    }
}
