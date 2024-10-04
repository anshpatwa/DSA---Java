public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;
    public class Node{
        private String data;
        private Node previous;
        private Node next;
        Node(String data){
            this.data = data;
            previous =null;
            next =null;
            size++;
        }
    }
    DoublyLL(){
        size=0;
    }
    public void addFirst(String data){
        Node newNode =new Node(data);
        if (head==null) {
           head=newNode;
           tail=newNode;
            return;
        }
        newNode.next =head;// a reference variable can point to any one thing. where as value/object can have any number of variables.
        head.previous=newNode;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.previous =tail;
        tail=newNode; // tail refer to newNode .Neither newNode refer to tail.
    }
    public void addAnyWhere(String data,int index){
        Node newNode = new Node(data);
        if (index==1) {
            addFirst(data);
        }
        if (index==size) {
            addLast(data);
            return;
        }
       Node previousNode = head;
       Node nextNode = head.next;
       for (int i = 1;i<index-1; i++) {
        previousNode =previousNode.next;
        nextNode=nextNode.next;
       }
       nextNode.previous=newNode;
       previousNode.next =newNode;
       newNode.previous=previousNode;
       newNode.next = nextNode;
    }
    public void add_after_data(String existing_data,String newdata){
        Node newNode = new Node(newdata);
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null && !currentNode.data.equals(existing_data)) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Node with data " + existing_data + " not found");
            return;
        }
        newNode.next = currentNode.next;
        newNode.previous = currentNode;
        currentNode.next = newNode;
        if (newNode.next != null) {
            newNode.next.previous = newNode;
        } else {
            tail = newNode;
        }
    }
    public void add_after_data2(String existing_data,String newdata){
        Node newNode = new Node(newdata);
        Node valueNode = find_node_value(existing_data);
       newNode.next = valueNode.next;
       newNode.previous =valueNode;
       valueNode.next = newNode;
       if (newNode.next!=null) {
        newNode.next.previous =newNode;
       }else{
        tail=newNode;
       }
    }
    public void display(){
        if (head==null) {
            System.out.println("Empty");
            return;
        }
        Node currNode =head;
        while (currNode!=null) {
            System.out.print(currNode.data+"-> ");
            currNode =currNode.next;
        }
        System.out.println("END");
    }
    public void display_reverse(){
        Node currNode = tail;
            while (currNode !=null) {
                System.out.print(currNode.data+" <-");
                currNode =currNode.previous;
            }
            System.out.println("START");
        }
    public Node getNode(int index){
        Node currNode =head;
        for (int i = 1; i <index; i++) {
            currNode=currNode.next;
        }
        return currNode;
    }
    public Node find_node_value(String newdata){
        Node currNode =head;
        while (currNode !=null && !currNode.data.equals(newdata)) {
            currNode =currNode.next;
        }
        return currNode;
    }
   
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        // list.addLast("Z");
        // list.addAnyWhere("Y", 3);
        // System.out.println(list.find_node_value("B"));
        list.add_after_data2("D", "Z");
        System.out.println(list.find_node_value("B").data);
        // System.out.println(list.getNode(3).next.data);
        // System.out.println(list.getNode(5).next.data);// error cause of null
        // System.out.println(list.head.data);
        list.display();
        // list.display_reverse(); 
        // System.out.println(list.size);
        // System.out.println(list.tail.previous.data); // A=tail
        // System.out.println(list.getNode(2).previous.data); // previous,next,data are private still the outtter class can access them.
    }
    
}
