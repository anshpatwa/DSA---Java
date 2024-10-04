public class reverse_K_group {
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
    reverse_K_group(){
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
    public Node reverseKGroup(Node head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        Node current = head;
        Node prev = null;

		int length = getLength(head);
		int count = length / k;
        while (count > 0) {
            Node last = prev;
            Node newEnd = current;
            Node next = current.next;
            for (int i = 1; current != null && i <=k; i++) { 
                current.next = prev;
                prev = current;
                current = next;
                if (next != null) {
                    next = next.next;
                }
            }
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }
            newEnd.next = current;
            prev = newEnd;
			count--;
        }
        return head;
    }
	public int getLength(Node head) {
		Node node = head;
		int length = 0;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}
    public static void main(String[] args) {
        reverse_K_group list = new reverse_K_group();
        list.addLast(1);
        list.addLast(2); 
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.display();
       int length = list.getLength(list.head);
       System.out.println(length);
        list.head = list.reverseKGroup(list.head, 3);
        list.display();
    }
}
