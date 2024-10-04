// https://leetcode.com/problems/reorder-list/description/
public class reOrderLL {
    Node head;
    Node tail;
    int size;
    public class Node{
        int val;
        Node next;
        Node(int val){
            this.val =val;
            next=null;
            size++;
        }
    }
    reOrderLL(){
        size=0;
    }
    public void addLast(int val){
        Node newNode = new Node(val);
        if (head==null) {
            head=newNode;
            tail =newNode;
            return;
        }
        Node lastNode =head;
        while (lastNode.next!=null) {
            lastNode =lastNode.next;
        }
        lastNode.next =newNode;
        newNode.next=null;
        tail=newNode;
    }
    public void display(){
        Node current = head;
        while (current!=null) {
            System.out.print(current.val+"->" );
            current=current.next;
        }
        System.out.println("END");
    }
    public Node getMid(Node head){
        Node fast = head;
        Node slow =head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node head){
        Node previous = null;
        Node present = head;
        Node ahead = present.next;
        while (present!=ahead) {
            present.next=previous;
            previous = present;
            present=ahead;
            if (ahead!=null) {
                ahead=ahead.next;
            }
        }
        // head =previous;
        return previous;
    }

    //  1->2->3->4->5      1->5->2->4->3
    public void reorder(Node head){
        if (head == null || head.next == null) {
            return;
        }
        Node mid = getMid(head);
        Node ptr1 =head;
        Node ptr2=reverse(mid); // previous return karega 
        Node reRevNode = ptr2;
        while (ptr1!=reRevNode && ptr2.next!=null) {
           Node temp1 = ptr1.next;
           Node temp2=ptr2.next;

           ptr1.next = ptr2;
           ptr2.next =temp1;

           ptr1 = temp1;
           ptr2=temp2;
        }

    }
public static void main(String[] args) {
   reOrderLL list = new reOrderLL();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);
    list.display();
    list.reorder(list.head);
    list.display();
    
}    
}
