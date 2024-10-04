public class isPalindrome {
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
    isPalindrome(){
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
    public Boolean isPalindrome(Node head){
        Node mid =getMid(head);
        Node ptr1 =head;
        Node ptr2 =reverse(mid);
        Node reRevNode = ptr2;
        while (ptr1!=reRevNode && ptr2!=null) {
         if (ptr1.val!=ptr2.val) {
            reverse(reRevNode);
            return false;
         }
         ptr1=ptr1.next;
         ptr2=ptr2.next;
        }
        reverse(reRevNode);
        return true;
    }
public static void main(String[] args) {
    isPalindrome list1 = new isPalindrome();
    list1.addLast(1);
    list1.addLast(2);
    list1.addLast(3);
    list1.addLast(4);
    list1.addLast(5);
    list1.addLast(5);
    list1.addLast(4);
    list1.addLast(3);
    list1.addLast(2);
    list1.addLast(1);

    boolean isPalindrome = list1.isPalindrome(list1.head);
    System.out.println(isPalindrome);
    
    
}    
}
