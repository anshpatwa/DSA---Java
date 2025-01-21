package LinkedList;

public class Linked_List {
    private Node head;
    public class Node{
        private String data ;
        Node next;
        Node(String data){
            this.data = data;
        }
    }
    public void insertNode(String data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode =currNode.next;
        }
        currNode.next=newnode;
    }
    public boolean deletNode(String target){
       if (head==null){
           return false;
       }
       Node aheadNode = head.next;
       Node prevNdoe = head;
       while (aheadNode!=null){
           if (aheadNode.data.equals(target)){
               prevNdoe.next=aheadNode.next;
               return true;
           }
           aheadNode=aheadNode.next;
           String aheadhvalue = aheadNode.data;
           prevNdoe=prevNdoe.next;
           String prevNodeval = prevNdoe.data;
       }
       return false;
    }
    public void display(){
        Node currNode = head;
        while (currNode!=null){
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.println("End");
    }

    public Node getNode(String target){
        Node moveNode = head;
        while (moveNode!=null){
            if (moveNode.data.equals(target)){
                return moveNode;
            }
            moveNode=moveNode.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.insertNode("A");
        list.insertNode("b");
        list.insertNode("c");
        list.insertNode("d");
        list.insertNode("e");
        list.insertNode("f");
        list.insertNode("g");

         
        list.deletNode("e");
        list.display();


    }
}
