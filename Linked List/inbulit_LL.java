import java.util.LinkedList;

import org.w3c.dom.Node;

public class inbulit_LL {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.add("C");
        linkedlist.add("D");
        linkedlist.add("E");
        System.out.println(linkedlist);


// OPERATIONS
        // linkedlist.remove("B");
        // linkedlist.remove(3);
        // linkedlist.removeLast();
        // linkedlist.removeFirst();
        linkedlist.set(1, "Z");
        System.out.println(linkedlist);

// LINKEDLIST to ARRAY        
        Object[] a = linkedlist.toArray();
        for(Object element : a) 
        System.out.print(element+" "); 
        
    }
}
