public class reverse_doubly_linkedList {
    static class Node{
        int data;
        Node next,prev;
    }
    static Node getNode(int data){
        Node new_Node = new Node();
        new_Node.data = data;
        new_Node.next=new_Node.prev = null;
        return new_Node;
    }
    static Node push(Node head_ref , Node new_node){
        new_node.prev=null;
        new_node.next=head_ref;
        if ((head_ref)!=null)
            (head_ref).prev=new_node;

        (head_ref) = new_node;
        return head_ref;
    }
    static Node Reverse(Node node){
        if (node==null)
            return null;

        Node temp = node.next;
        node.next = node.prev;
        node.prev =temp;
        if (node.prev==null)
            return node;

        return Reverse(node.prev);
    }
    static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print( head.data + "<-->");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = push(head,getNode(2));
        head = push(head,getNode(4));
        head = push(head,getNode(8));
        head = push(head,getNode(10));
        printList(head);
        head = Reverse(head);
        System.out.println();
        System.out.println("Reversed:");
        printList(head);

    }
}
