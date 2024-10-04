public class practice_LL {
    Node head;
    Node tail;
   private int size;
   practice_LL(){
    size=0;
   }
    public class Node{
        private int val;
        private Node next;
        Node(int val){
            this.val=val;
            this.next=null;
            size++;
        }
    }
    public void addFirst(int val){
        Node newNode = new Node(val);
        if (head==null) {
            newNode.next=head;
            tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
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
        tail=lastNode;
     }
    public void printList(){
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.val+"-> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public void size(){
        System.out.println("Size: "+size);
    }
    public Node getNode(int index){
        Node currNode = head;
        for (int i = 1; i < index; i++) {
            currNode =currNode.next;
        }
        return currNode;
    }
    public void findinLL(int data){
        int index =1;
        Node currNode = head;   // head because 1st wala node bhee toh check krna haina bhai
        while (currNode.val != data) {
            currNode =currNode.next;
            index++;
        }
        System.out.println("Index: "+index);
    }
   
    public void removeFirst(){
        Node currNode = head.next;
        head =currNode;
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
        Node currNode =head;
        Node lasNode =head.next;
        while (lasNode.next !=null) {
            currNode =currNode.next;
            lasNode =lasNode.next;
        }
        currNode.next=null;
        size--;
    }
    public void deletAnyWhere(int index){
        if (index<=1) {
            removeFirst();
            return;
        }
        if (index==size) {
            removeLast();
            return;
        }
        Node previous = getNode(index-1);
        // Node forward = getNode(index+1);
        // previous.next = forward;
        previous.next=previous.next.next;
        size--;
    }
    public Node getMid(Node head){
        Node fast = head;
        Node mid = head; // slow
        while (fast!=null && fast.next!=null) {
            mid = mid.next;
            fast =fast.next.next;
        }
        return mid;
    }
    public void swapValues(int index1,int index2){
        if (index1<=0 || index2 <=0) {
            System.out.println("Invalid!!!! Node starts from 1.");
        }
        if (index1>size || index2>size) {
            System.out.println("Invalid Index.");
        }
        Node firstNode = getNode(index1);
        Node secondNode = getNode(index2);
        int temp=0;
        temp = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = temp;
    }
    public static practice_LL merge(practice_LL first,practice_LL second){ // this simply mergers the two lists in the default order
        if (first.head==null) {
            return second;
        }
        if(second.head==null) {
            return first;
        }
        practice_LL list3 = new practice_LL();
        list3.head=first.head;
        Node current = first.head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = second.head;
        return list3 ;
    }
    public practice_LL merge2(practice_LL list1,practice_LL list2){ // this merges the list in sorted order.they should be in sorted order from before.
        practice_LL newlist = new practice_LL(); 
        if (list1.head.next==null || list1.head ==null) {
            return list1;
        }
        if (list2.head.next==null|| list2.head==null) {
            return list2;
        }
        Node ptr1 = list1.head;
        Node ptr2 = list2.head;
        while (ptr1!=null && ptr2!=null) {
            if (ptr1.val<ptr2.val) {
                newlist.addLast(ptr1.val);
                ptr1 = ptr1.next;
            }else{
                newlist.addLast(ptr2.val);
                ptr2= ptr2.next;
            }
        }
        while (ptr1!=null) {
            newlist.addLast(ptr1.val);
            ptr1 =ptr1.next;
        }
        while (ptr2!=null) {
            newlist.addLast(ptr2.val);
            ptr2 =ptr2.next;
        }
        return newlist;

    }
  
    public Node reverse(Node head){ // this reverses the same list and retunr the same list
        Node previous = null;
        Node presentNode=head;
        Node aheadNode = presentNode.next;
        while (presentNode!=aheadNode) { // or (presentNode !=null)
            presentNode.next = previous;
            previous = presentNode;
            presentNode = aheadNode;
            if (aheadNode!=null) {
                aheadNode = aheadNode.next;
            } 
        }
   
            return previous;
       }
    public  practice_LL reverse2(practice_LL list){// this returns the new reverse list.
      practice_LL copylist = new practice_LL();
     Node current = list.head;
     while (current!=null) {
        copylist.addLast(current.val);
        current=current.next;
     }

      Node previous = null;
      Node presentNode = copylist.head;
    
      Node aheadNode = presentNode.next;
      while (presentNode!=aheadNode) { // or (presentNode !=null)
        presentNode.next = previous;
        previous = presentNode;
        presentNode = aheadNode;
        if (aheadNode!=null) {
            aheadNode = aheadNode.next;
        } 
    }
        copylist.head=previous;
        return copylist;
    }
// Reverse in Between
public Node reverseBetween(Node head, int left, int right) {
    if (left==right) {
        return head;
    }
    // 1->2->3->4->5     1->4->3->2->5
    Node current = head; //1
    Node prev = null;
    for (int i = 1;current!=null && i <left; i++) {
        prev =current;//1
        current=current.next;//2
    }
    Node last = prev;//1
    Node newEnd =current;//2
    Node next = current.next;//3
    for (int i = 0; i < right-left+1; i++) { // ek extra bar kyuki next element peh current chahiye apan ko
        current.next = prev;
        prev= current;
        current=next;
        if (next!=null) {
            next= next.next;
        }
    }
    if (last != null) {
        last.next = prev;
    } else {
        head = prev;
    }
    newEnd.next = current;
    return head;
}   
// check Palindrome
//https://leetcode.com/problems/palindrome-linked-list/description/
public boolean checkPalindrome(Node listHead){
    
    Node fast = head;
    Node mid = head;
    while (fast!=null&&fast.next!=null) {
        mid=mid.next;
        fast=fast.next.next;
    }
 
    Node ptr1=listHead;
    Node reversehead= mid;
    Node ptr2 = reverse(mid);
  
    while (ptr1!=null && ptr2!=null) {
        if (ptr1.val!=ptr2.val) {
            reverse(reversehead);
            return false;
        }
        ptr1=ptr1.next;
        ptr2=ptr2.next;
    }
    reverse(reversehead);
    return true;
  
    
}
//https://leetcode.com/problems/reorder-list/description/
public void reorderList(Node head) {
    if (head == null || head.next == null) {
        return;
    }
    
    // Find the middle of the list
    Node mid = getMid(head);
    Node secondHalf = mid.next;
    mid.next = null;  // Split the list into two halves
    
    // Reverse the second half
    secondHalf = reverse(secondHalf);
    
    // Merge the two halves
    Node first = head;
    Node second = secondHalf;
    while (second != null) {
        Node temp1 = first.next;
        Node temp2 = second.next;
        
        first.next = second;
        second.next = temp1;
        
        first = temp1;
        second = temp2;
    }
}
    public static void main(String[] args) {
        // practice_LL list = new practice_LL();
        // // list.addFirst(10);
        // // list.addFirst(20);
        // // list.addFirst(30);
        // // list.addFirst(40);
        // list.addLast(100);
        // list.addLast(200);
        // list.addLast(300);
        // list.addLast(400);
        // list.addLast(500);
        // // list.findinLL(100);
        // // list.removeFirst();
        // // list.removeFirst();
        // // list.removeLast();
        // // list.removeLast();
        // // list.deletAnyWhere(4);
        // // list.size();
        // // list.printList();
        // // System.out.println(list.getNode(4).val);

        // // Swap
        // // list.swapValues(1, 5);
        // list.printList();
        // // list.head =list.reverseBetween(list.head, 200, 400);
        // // list.printList();
        // list.reverseBetween(list.head, 2, 4);
        // list.printList();


        // palindrome creation
        practice_LL list1 = new practice_LL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5); // for reorder
        
    //     practice_LL list2 = new practice_LL();
    //     list2 = list1.reverse2(list1);
    //     list1.printList();
    //     list2.printList();

    //     practice_LL palindrome = new practice_LL();
    //     palindrome =merge(list1, list2);
    //     palindrome.printList();
        
        
    //    boolean check= palindrome.checkPalindrome(palindrome.head);
    //    System.out.println(check);
    //    boolean check2 = list1.checkPalindrome(list1.head);
    //    System.out.println(check2);

    // reOrder list
    list1.reorderList(list1.head);
    list1.printList();
    }
}
