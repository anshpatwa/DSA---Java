public class Insertion_sort {
    Node head;
    Node sorted;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
            next =null;
        }
    }
    public void push(int val){  // addFirst
        Node newNode = new Node(val);
        newNode.next = head;
        head =newNode;
    }
    public void insertionSort(Node headref){
        sorted = null;
        Node current = headref;
        while (current!=null) {
            Node nextNode = current.next;
            sortedInsert(current);
            current=nextNode;
        }
        head =sorted;
    }
    public void sortedInsert(Node newNode){
        if (sorted==null || sorted.val>=newNode.val) {
            newNode.next =sorted;
            sorted=newNode;
        }else{
            Node current = sorted;
            while (head!=null && current.next.val<newNode.val) {
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    public void display(){
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.val+"-> ");
            currNode=currNode.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Insertion_sort list =new Insertion_sort();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.display();
        list.insertionSort(list.head);
        list.display();
    }
    
}
