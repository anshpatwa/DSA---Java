public class merge_LL {
    ListNode head;
    ListNode tail;
    int size=0;
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            next=null;
            size++;
        }
    }
    merge_LL(){
        size=0;
        head=null;
        tail=null;
    }
    public void addFirst(int val){
        ListNode newNode = new ListNode(val);
        if (head==null) {
            head=newNode;
            tail=newNode;
        }else{
        newNode.next =head;
        head =newNode;
        }
    }
    public void addLast(int val){
        ListNode newNode = new ListNode(val);
        if (head==null) {
         head=newNode;        // 
         return;
        }
        ListNode lastNode=head;
        while (lastNode.next!=null) {
         lastNode= lastNode.next;
        }
        lastNode.next =newNode;
        tail=newNode;
     }
    public void display(){
        ListNode currNode = head;
        if (head==null) {
            System.out.println("Empty hai List");
        }
        while (currNode!=null) {
            System.out.print(currNode.val+"-> ");
            currNode = currNode.next;
        }
        System.out.println("End");
    }
    public static merge_LL merge(merge_LL first,merge_LL second){
        if (first.head==null) {
            return second;
        }
        if(second.head==null) {
            return first;
        }
        merge_LL list3 = new merge_LL();
        first.tail.next = second.head;
        list3.head=first.head;
        return list3 ;
    }
    public static merge_LL mergeTwoLists(merge_LL list1,merge_LL list2){
        merge_LL ans = new merge_LL();
        ListNode f = list1.head;
        ListNode s = list2.head;
        while (f!=null && s!=null) {// dono me se ek bhee null hua toh dusri list me sarre bade elements hi bachage soo while loop for both the lists.
            if (f.val<s.val) {
                ans.addLast(f.val);
                f=f.next;
            }else{
                ans.addLast(s.val);
                s= s.next;
            }// jo list khatam hogi uska null toh obviously aa chuka hoga soo jo khatam hogi uska neeche wala while execute hoga hi nhi .
        }
        while (f!=null) {
            ans.addLast(f.val);
            f= f.next;
        }
        while (s!=null) {
            ans.addLast(s.val);
            s=s.next;
        }
        return ans;
    }
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head; 
        }
        ListNode previous = null;
        ListNode present = head;
        ListNode ahead = present.next;
        while (present!=ahead) {
            present.next=previous;
            previous = present;
            present =ahead;
            if (ahead!=null) {
                ahead =ahead.next;
            }
        }
        head=previous;
        return previous;
        
    }
    public ListNode reverseRange(ListNode head,int fromPostion,int toPosition){
        ListNode previous=null;
        ListNode current=head;
          // 1->2->3->4->5     1->4->3->2->5
        for (int i = 1; i < fromPostion; i++) {  // ek hi iteration nhi ho rha hai bc
            previous=current;//1 (head)
            current=current.next;//2
        }
        ListNode last = previous;//1
        ListNode newEnd = current;//2
        ListNode ahead= current.next;//3
        for (int i = 0; i < toPosition-fromPostion+1; i++) {
            current.next=previous;
            previous =current;
            current=ahead;
            if (ahead!=null) {
                ahead=ahead.next;
            }
        }
        if (last!=null) {// by changes agare frompostion 1 hui toh ?
            last.next=previous;
        }else{
            head = previous;
        }
        newEnd.next=current;
        return head;
    }
    public ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode mid = head; // slow
        while (fast!=null && fast.next!=null) {
            mid = mid.next;
            fast =fast.next.next;
        }
        return mid;
    }
    
    public static void main(String[] args) {
        merge_LL list1 = new merge_LL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list1.display();
        // list1.head=list1.reverseRange(list1.head, 2, 4);
        // list1.head=list1.reverse(list1.head);
    
        // list1.display();
        // System.out.println(list1.tail.val);
     
  


        // merge_LL list2 = new merge_LL();
        // list2.addFirst(1);
        // list2.addLast(3);
        // list2.addLast(4);
        // list2.addLast(6);
        // list2.head= list2.reverse(list2.head);
        // list2.display();
        // merge_LL list3 = new merge_LL();
        // list3 = mergeTwoLists(list1, list2);
        // list3.display();
        // list3= merge(list1, list2);
        // list3.display();
    }
}
