public class bubble_sort {
    int size=0;
    Node head;
    Node tail;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next =null;
        }
    }
    bubble_sort(){
        size =0;
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if (head==null) {
            head=newNode;
            tail=newNode;
            return;   // yeh impt hai bohot
        }else{
        newNode.next =head;
        head=newNode;
        }
    }
    public void addlast(int val){
        Node newNode = new Node(val);
        Node lastNode = head;
        if (head==null) {
            head=newNode;
            return;
        }
        while (lastNode.next!=null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        tail=newNode;
        newNode.next=null;
    }
    public void display(){
        Node curNode = head;
        while (curNode!=null) {
            System.out.print(curNode.val+"-> ");
            curNode = curNode.next;
        }
        System.out.println("END");
    }

    //  BUBBLE SORT 
    public static void swap(Node ptr1,Node ptr2){
        int temp = ptr2.val;
        ptr2.val = ptr1.val;
        ptr1.val = temp;
    }
    public static void bubbleSort(Node head){
        boolean swapped;
        Node current;
        if (head==null) {
            return;
        }
        do {
            swapped =false;
            current =head;
            while (current.next!=null) {
                if (current.val>current.next.val) {
                    swap(current, current.next);
                    swapped =true;
                }else{    // else for equal values
                current = current.next;
                }
            }
        } while (swapped);
    }
    public static void main(String[] args) {
        bubble_sort list = new bubble_sort();
        list.addlast(5);
        list.addlast(5);
        list.addlast(4);
        list.addlast(3);
        list.addlast(2);
        list.addlast(1);
        list.display();
        bubbleSort(list.head);
        list.display();
    }
}
