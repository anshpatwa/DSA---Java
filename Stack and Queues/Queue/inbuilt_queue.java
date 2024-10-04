import java.util.LinkedList;
import java.util.Queue;

public class inbuilt_queue {
    // queue is an interface that extends collection
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // LL provides all the methods required by the Queue interface.LinkedList provides additional functionality beyond what's required by the Queue interface.and queue does not a class in java unlike stack.
        queue.add(10);
        queue.add(7);
        queue.add(13);
        queue.add(20);
        queue.add(19);
        System.out.println(queue.remove());// removes the first element that was added.(10)
        System.out.println(queue.remove());//7
        System.out.println(queue.peek());
    //    System.out.println(queue.poll());//Removing and returning the first element (the head) of the list.


    // DEQUEUE - Deck
    // Add or Remove from both the sides

    
        
    }
}
/*
Basic Operations on Queue

 1. enqueue(): Inserts an element at the end of the queue i.e. at the rear end.
 2. dequeue(): This operation removes and returns an element that is at the front end of the queue.
 3. front(): This operation returns the element at the front end without removing it.
 4. rear(): This operation returns the element at the rear end without removing it.
 5. isEmpty(): This operation indicates whether the queue is empty or not.
 6. isFull(): This operation indicates whether the queue is full or not.
 7. size(): This operation returns the size of the queue i.e. the total number of elements it contains.  
 
  using interfaces for queues in Java provides numerous benefits in terms of abstraction, polymorphism, extensibility, decoupling, and standardization.

  Advantages of using a linked list for queue over Arrays:
        1. Dyanamic Size
        2. Efficient insertions and deletion
        3. No Pre-Allocations
        4. Flexibility
        5. Cache
  Disadvantages :
        1. Random Access : accessing a element is not easy cause you have to traverse the whole linkedList.
        2. Additional Space 
        
 */